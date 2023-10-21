package com.hackathon.springboot.service;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackathon.springboot.cruddemo.entity.CommsHub;

import io.awspring.cloud.sqs.annotation.SqsListener;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MessageReceiverService {

	@Autowired
	private CommsHubService commsHubService;

	@SqsListener(value = "sqs-demo-queue", pollTimeoutSeconds = "20")
	public void queueListener(String message) {
		log.info("Received message {}", message);
		CommsHub commsHub;
		try {
			commsHub = new ObjectMapper().readValue(message, CommsHub.class);
			commsHubService.createCommunication(commsHub);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}
}