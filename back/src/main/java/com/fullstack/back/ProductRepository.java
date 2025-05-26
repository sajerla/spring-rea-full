package com.fullstack.back;

import com.fullstack.back.Product;
import org.springframework.data.jpa.repository.JpaRepository;




import org.springframework.data.jpa.repository.JpaRepository;

    public interface ProductRepository extends JpaRepository<Product, Long> {
    }

