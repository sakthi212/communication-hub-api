package com.hackathon.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.springboot.cruddemo.entity.CommsHub;
import com.hackathon.springboot.service.CommsHubService;

@RestController
public class CommsHubController {

	@Autowired
	private CommsHubService commsHubService;

	@PostMapping("/createCommunication")
	public CommsHub createCommunication(@RequestBody CommsHub commHub) {

		return commsHubService.createCommunication(commHub);

	}

}
