package com.processor.kiteorderprocessor.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.processor.kiteorderprocessor.model.Order;


@Service
public class ProducerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerService.class);

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    @Value("${spring.kafka.order-topic}")
    private String orderTopic;

    public void sendMessage(Order order){
        LOGGER.info(String.format("order sent to %s-> %s", orderTopic, order));
        kafkaTemplate.send(orderTopic, order);
    }
}
