package com.example.demo;

import com.example.demo.models.Product;
import com.example.demo.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    ProductRepo productRepo;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {

        System.out.println("App started");

        List<String> imgs = new ArrayList<>();
        imgs.add("img_1");
        imgs.add("img_2");
        Product p = new Product(imgs);
        productRepo.save(p);
    }
}
