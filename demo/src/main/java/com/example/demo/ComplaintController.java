package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/complaints") 
public class ComplaintController {

    @PostMapping("/submit")
    public ResponseEntity<String> receiveComplaint(@RequestBody ComplaintRequest complaint){
        System.out.println("Received complaint: " + complaint);
        return ResponseEntity.ok("Complaint received successfully");
    }
}
