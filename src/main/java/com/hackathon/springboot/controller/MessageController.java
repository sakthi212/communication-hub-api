package com.hackathon.springboot.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.springboot.service.MessageSenderService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class MessageController {

    private final MessageSenderService messageSenderService;

    @PostMapping("/sendMessage")
    public ResponseEntity<String> sendMessage(@RequestBody final String message){
        messageSenderService.sendMessage(message);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}