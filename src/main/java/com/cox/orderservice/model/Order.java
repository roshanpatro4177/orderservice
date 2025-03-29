package com.cox.orderservice.model;



import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "orders")
@Data
public class Order {


    @Id
    private String id;
    private String customerId;
    private String status;
    private double amount;
}
