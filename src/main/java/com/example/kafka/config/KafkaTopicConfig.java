package com.example.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {//responsible creating topics
    @Bean
    public NewTopic firstTopic(){
        return TopicBuilder.name("omartopic")
                .build();
    }
}
