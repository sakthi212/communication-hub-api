package com.hackathon.springboot.utils;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.auth.InstanceProfileCredentialsProvider;
import com.amazonaws.services.comprehend.AmazonComprehend;
import com.amazonaws.services.comprehend.AmazonComprehendClientBuilder;
import com.amazonaws.services.comprehend.model.DetectSentimentRequest;

public class HackathonUtils {

	public static String getSentiment(String comprehendText, String language) {

		String text = comprehendText;

		/*
		 * AmazonComprehend comprehendClient = AmazonComprehendClientBuilder.standard()
		 * .withCredentials(new InstanceProfileCredentialsProvider(false)).build();
		 */
		AWSCredentialsProvider awsCreds = DefaultAWSCredentialsProviderChain.getInstance();

		
		 AmazonComprehend comprehendClient = AmazonComprehendClientBuilder.standard()
		 .withCredentials(awsCreds) .withRegion("us-east-1") .build();
		 
		
		DetectSentimentRequest detectSentimentRequest = new DetectSentimentRequest().withText(text);
		detectSentimentRequest.setLanguageCode(language);
		return comprehendClient.detectSentiment(detectSentimentRequest).getSentiment();
	}

}
