package com.cox.orderservice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CustomerEventListener {

    @KafkaListener(topics = "customer-topic", groupId = "order-service-group")
    public void listenCustomerEvent(String customerId) {
        System.out.println("Received new customer registration: " + customerId);
        // Additional logic for processing new customers if required
    }
}
