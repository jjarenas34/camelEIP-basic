package com.example.product.config;

import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracion {
    @Autowired
    private CamelContext camelContext;



    @Bean
    ProducerTemplate producerTemplate(){
        return camelContext.createProducerTemplate();
    }
/*
    @Bean
    ConsumerTemplate consumerTemplate(){
        return camelContext.createConsumerTemplate();
    }

 */
}
