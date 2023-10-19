package com.hackathon.springboot.comprehend;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.comprehend.AmazonComprehend;
import com.amazonaws.services.comprehend.AmazonComprehendClientBuilder;
import com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest;
import com.amazonaws.services.comprehend.model.DetectDominantLanguageResult;
import com.amazonaws.services.comprehend.model.DetectSentimentRequest;
import com.amazonaws.services.comprehend.model.DetectSentimentResult;
public class Comprehend {



	    public static void main( String[] args )
	    {

	        String text = "I am very happy today";

	        // Create credentials using a provider chain. For more information, see
	        // https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/credentials.html
	        AWSCredentialsProvider awsCreds = DefaultAWSCredentialsProviderChain.getInstance();

	        AmazonComprehend comprehendClient =
	            AmazonComprehendClientBuilder.standard()
	                                         .withCredentials(awsCreds)
	                                         .withRegion("us-east-1")
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
	        System.out.println("Customer sentiment is \n" +detectSentimentResult.getSentiment());
	        System.out.println("Calling DetectSentiment\n");
	        
	        System.out.println("Done");
	    
	}

}
