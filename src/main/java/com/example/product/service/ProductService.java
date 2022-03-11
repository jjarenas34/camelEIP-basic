package com.example.product.service;

import com.example.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public List<Product> busProductporCategoria(final String categoria){
        List<Product> productos = new ArrayList<Product>();

        productos.add(new Product("nombre1","categoria1"));
        productos.add(new Product("nombre2","categoria1"));

        return productos;
    }
}
