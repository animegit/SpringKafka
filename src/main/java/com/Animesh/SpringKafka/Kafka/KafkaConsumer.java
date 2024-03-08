package com.Animesh.SpringKafka.Kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    public static final Logger logger= LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "Kafka",groupId = "myGroup")
    public void consume(String msg){
        logger.info(String.format("Message received is : %s",msg));

    }
}
