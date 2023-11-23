package com.hdfc.Grocery.App.dao;

import com.hdfc.Grocery.App.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional query methods can be defined here if needed
    @Query(value = "SELECT * FROM products ORDER BY RAND() LIMIT 5", nativeQuery = true)
    List<Product> findRandomProducts();
}

