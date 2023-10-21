package com.hackathon.springboot.controller;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.springboot.cruddemo.entity.CommsHub;
import com.hackathon.springboot.repository.CommsHubRepository;

@RestController
public class CommsHubController {

    @Autowired
    private CommsHubRepository commsHubRepository;

    @GetMapping("/getCommunications")
    public ResponseEntity<List<CommsHub>> getCommunications() {
        List<CommsHub> commsHubList = (List<CommsHub>) commsHubRepository.findAll();
        if (commsHubList != null ) {
            return ResponseEntity.ok()
                    .cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS))
                    .body(commsHubList);
        }else {
            return null;
        }
    }

    @GetMapping("/getCommunication")
    public ResponseEntity<List<CommsHub>> getCommunication(@RequestParam String customerId, @RequestParam String firstName,@RequestParam String lastName) {
        List<CommsHub> commsHubList = (List<CommsHub>) commsHubRepository.findByCustomerId(customerId);
        if (commsHubList != null ) {
            return ResponseEntity.ok()
                    .cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS))
                    .body(commsHubList);
        }else {
            return null;
        }
    }

    @PostMapping("/createCommunication")
    public ResponseEntity<List<CommsHub>> createCommunication(@RequestParam String customerId, @RequestParam String firstName,@RequestParam String lastName) {
        List<CommsHub> commsHubList = (List<CommsHub>) commsHubRepository.findByCustomerId(customerId);
        if (commsHubList != null ) {
            return ResponseEntity.ok()
                    .cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS))
                    .body(commsHubList);
        }else {
            return null;
        }
    }
    
}
