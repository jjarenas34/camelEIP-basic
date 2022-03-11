package com.example.product.route;

import com.example.product.service.ProductService;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FetchProductRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception{
        from("direct:fetchProducts")
                .routeId("direct-id-fetchProducts")
                .tracing()
                .log("el log es ${body}")
                .bean(ProductService.class,"busProductporCategoria")
                .end();
    }
}