package com.processor.kiteorderprocessor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.processor.kiteorderprocessor.service.ProducerService;
import com.processor.kiteorderprocessor.model.Order;

@RestController
@RequestMapping("/order")
public class KafkaProducerController {

    private ProducerService kafkaProducer;

    public KafkaProducerController(ProducerService kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody Order order){
        kafkaProducer.sendMessage(order);
        return ResponseEntity.ok("Message sent to kafka topic");
    }
}