package com.EndUser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = AppConstants.LOCATION__UPDATE_TOPIC, groupId = AppConstants.LOCATION__UPDATE_GROUP_ID)
    public void updatedLocation(String location) {
        System.out.println(location);
    }
}
