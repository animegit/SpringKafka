package com.Animesh.SpringKafka.Kafka;

import com.Animesh.SpringKafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {
    private static final Logger logger= LoggerFactory.getLogger(JsonKafkaProducer.class);

    public KafkaTemplate<String, User> kafkaTemplate;

    public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void produce(User data){
        logger.info(String.format("Message sent is %s",data.toString()));
        Message<User> message= MessageBuilder.withPayload(data).setHeader(KafkaHeaders.TOPIC,"KafkaJson").build();
        kafkaTemplate.send(message);


    }
}
