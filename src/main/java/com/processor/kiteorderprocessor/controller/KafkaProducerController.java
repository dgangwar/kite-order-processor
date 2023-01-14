package com.processor.kiteorderprocessor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.processor.kiteorderprocessor.service.ProducerService;

@RestController
@RequestMapping("/order")
public class KafkaProducerController {

    private ProducerService kafkaProducer;

    public KafkaProducerController(ProducerService kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to kafka topic");
    }
}