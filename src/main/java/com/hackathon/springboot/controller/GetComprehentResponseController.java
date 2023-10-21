package com.hackathon.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.auth.InstanceProfileCredentialsProvider;
import com.amazonaws.services.comprehend.AmazonComprehend;
import com.amazonaws.services.comprehend.AmazonComprehendClientBuilder;
import com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest;
import com.amazonaws.services.comprehend.model.DetectDominantLanguageResult;
import com.amazonaws.services.comprehend.model.DetectSentimentRequest;
import com.amazonaws.services.comprehend.model.DetectSentimentResult;
import com.hackathon.springboot.model.ComprehendRequest;
import com.hackathon.springboot.model.ComprehendResponse;

@RestController
public class GetComprehentResponseController {

  
    @PostMapping("/getSentiment")
    public ComprehendResponse saveContactInquiryDetails(@RequestBody ComprehendRequest comprehendRequest) {
    	
        String text = comprehendRequest.getText();

        // Create credentials using a provider chain. For more information, see
        // https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/credentials.html
       // AWSCredentialsProvider awsCreds = DefaultAWSCredentialsProviderChain.getInstance();

        AmazonComprehend comprehendClient =
            AmazonComprehendClientBuilder.standard()
                                         .withCredentials(new InstanceProfileCredentialsProvider(false))
                                      //   .withRegion("us-east-1")
                                         .build();

        // Call detectDominantLanguage API
        System.out.println("Calling DetectDominantLanguage");
        DetectDominantLanguageRequest detectDominantLanguageRequest = new DetectDominantLanguageRequest().withText(text);
        DetectDominantLanguageResult detectDominantLanguageResult = comprehendClient.detectDominantLanguage(detectDominantLanguageRequest);
        detectDominantLanguageResult.getLanguages().forEach(System.out::println);
        System.out.println("Calling DetectDominantLanguage\n");

        System.out.println("Calling Detectsentiment");
        DetectSentimentRequest detectSentimentRequest = new DetectSentimentRequest().withText(text);
        detectSentimentRequest.setLanguageCode("en");
        DetectSentimentResult detectSentimentResult = comprehendClient.detectSentiment(detectSentimentRequest);
        System.out.println("Customer sentiment is " +detectSentimentResult.getSentiment());
        System.out.println("Calling DetectSentiment\n");
        
        System.out.println("Done");
    	
        ComprehendResponse comprehendResponse = new ComprehendResponse();
        comprehendResponse.setSentiment(detectSentimentResult.getSentiment());
		return comprehendResponse;

    }


}
