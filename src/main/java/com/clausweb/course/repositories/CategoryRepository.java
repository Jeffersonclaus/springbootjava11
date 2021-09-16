package com.clausweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clausweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
	

