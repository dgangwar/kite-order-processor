package com.processor.kiteorderprocessor.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
class KafkaTopicConfig {

    @Value("${spring.kafka.order-topic}")
    private String orderTopic;

    @Bean
    public NewTopic topic1() {
        return TopicBuilder.name(orderTopic).build();
    }
}