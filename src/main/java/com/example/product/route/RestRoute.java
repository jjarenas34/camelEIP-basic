package com.example.product.route;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class RestRoute extends RouteBuilder {

    @Autowired
    Environment env;

    @Override
    public void configure(){
        CamelContext context = new DefaultCamelContext();

        restConfiguration()
                .contextPath("/comercio")
                .apiContextPath("/doc")
                .port(env.setProperty("server.port",8080))
                .bindingMode(RestBindingMode.json);
        rest("orden/proceso")
                .get("/").description("proceso de orden")
                .route().routeId("")
                .bean(OrdenService.class, "generarOrden")
                .to("direct:fetchProcess")
                .endRest();

    }
}
