package com.clausweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clausweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
	

