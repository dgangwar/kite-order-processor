package com.processor.kiteorderprocessor.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class ConsumerService {

    private final Logger logger = LoggerFactory.getLogger(getClass());


    @KafkaListener(topics = {"${spring.kafka.order-topic}"}, containerFactory = "kafkaListenerJsonFactory", groupId = "${spring.kafka.consumer.group_id}")
    public void consumeOrder(String message) {
        logger.info("**** -> Consumed message :: {}", message);
    }

}
