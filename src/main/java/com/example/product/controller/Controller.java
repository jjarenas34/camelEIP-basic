package com.example.product.controller;

import com.example.product.model.Product;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    ProducerTemplate producerTemplate;

    @GetMapping("/products/{categoria}")
    @ResponseBody
    public List<Product> getListaProductos(@PathVariable("categoria") final String categoria){
        producerTemplate.start();
        List<Product> productos=producerTemplate.requestBody("direct:fetchProducts",categoria, List.class);
        producerTemplate.stop();
        return productos;
    }
}
