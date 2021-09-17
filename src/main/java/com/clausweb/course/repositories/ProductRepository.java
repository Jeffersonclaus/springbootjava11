package com.clausweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clausweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
	

