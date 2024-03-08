package com.Animesh.SpringKafka.Kafka;


import com.Animesh.SpringKafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger log= LoggerFactory.getLogger(JsonKafkaProducer.class);
    @KafkaListener(topics = "KafkaJson",groupId = "myGroup")
    public void consume(User user){
        log.info(String.format("Meaasge received is: %s"),user.toString());

    }
}
