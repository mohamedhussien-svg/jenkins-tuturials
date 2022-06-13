package com.jenkins.controller;

import com.jenkins.dto.MessageDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class TestController {

    @GetMapping
    public ResponseEntity<MessageDTO> welcomeJenkins() {
        return ResponseEntity.ok(new MessageDTO("Welcome to your Jenkins Tutorials"));
    }
}
