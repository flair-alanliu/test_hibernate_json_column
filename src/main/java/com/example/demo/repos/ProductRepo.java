package com.example.demo.repos;


import com.example.demo.models.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepo extends CrudRepository<Product, Long> {
}
