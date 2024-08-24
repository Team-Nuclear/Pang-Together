package com.pangTogether.repository;

import com.pangTogether.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long>{
    List<Product> findByPCategory(String category);
    List<Product> findByPNameContaining(String name);
}
