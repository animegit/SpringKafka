package com.Animesh.SpringKafka.Controller;


import com.Animesh.SpringKafka.Kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class MessageController {
    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/publish")
    // http:localhost:8080/api/v1/users/publish?message=Hello Apache
    public ResponseEntity<String> publish(@RequestParam("message") String msg){
        kafkaProducer.sendMessage(msg);
        return ResponseEntity.ok("Sent Successfully!!");
    }
}
