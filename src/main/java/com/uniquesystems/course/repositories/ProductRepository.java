package com.uniquesystems.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uniquesystems.course.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
