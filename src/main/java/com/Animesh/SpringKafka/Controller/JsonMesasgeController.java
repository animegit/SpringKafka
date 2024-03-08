package com.Animesh.SpringKafka.Controller;

import com.Animesh.SpringKafka.Kafka.JsonKafkaProducer;
import com.Animesh.SpringKafka.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMesasgeController {
    @Autowired
    public JsonKafkaProducer jsonKafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        jsonKafkaProducer.produce(user);
        return ResponseEntity.ok("Json Message Sent Successfully!!");
    }
}
