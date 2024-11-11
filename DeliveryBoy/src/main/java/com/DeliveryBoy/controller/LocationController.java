package com.DeliveryBoy.controller;

import com.DeliveryBoy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

public class LocationController {
    @RestController
    @RequestMapping("/delivery")
    public static class KafkaController {

        @Autowired
        private KafkaService
                kafkaService;

        @PostMapping("/update")
        public ResponseEntity<?> updateLocation() {
            int count = 0;
            for (int i = 0; i < 5; i++) {
                kafkaService.updateLocation("[" + Math.round(Math.random() * 100) + "," + Math.round(Math.random() * 100) + "]");
                count++;
            }
            System.out.println("---------------------------------");
            System.out.println("Producer Count is: " + count);
            return new ResponseEntity<>(Map.of("Message - ", "Location Updated"), HttpStatus.OK);
        }
    }
}
