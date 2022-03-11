package com.example.product.route;

import com.example.product.service.Estrategia;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class OrdenProcesoFetch extends RouteBuilder {

    @Override
    public void configure() throws Exception{
        from("direct:fetchProcess")
                .split(body(), Estrategia).parallelProcessing()
                .end();
    }
}
