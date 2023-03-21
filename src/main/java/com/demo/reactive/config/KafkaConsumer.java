package com.demo.reactive.config;

import org.springframework.beans.factory.annotation.Value;import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumer {


  @KafkaListener(topics = "${app.default.topic}", groupId = "${spring.kafka.consumer.group-id}")
  public void consume(String message) {
    System.out.println("Received message: " + message);
    // Process the message here
  }
}
