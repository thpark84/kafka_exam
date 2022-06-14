package com.lgcns.kafka_test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);


    @KafkaListener(topics  = "${kafka-info.topic-name}"
                 , groupId = "${kafka-info.group-name}"
    )
    public void consume(String message) {
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }
}