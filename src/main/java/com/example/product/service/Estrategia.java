package com.example.product.service;

import org.apache.camel.AggregationStrategy;
import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregateProcessor;
import org.springframework.stereotype.Component;

@Component
public class Estrategia implements AggregationStrategy {

    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange){
       return oldExchange;
    }
}
