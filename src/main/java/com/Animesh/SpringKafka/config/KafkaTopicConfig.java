package com.Animesh.SpringKafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {


    //Declare Bean to a new topic in kafka
    @Bean
    public NewTopic Topic(){
        return TopicBuilder.name("Kafka").build();
    }
    @Bean
    public NewTopic Topic2(){
        return TopicBuilder.name("KafkaJson").build();
    }

}

