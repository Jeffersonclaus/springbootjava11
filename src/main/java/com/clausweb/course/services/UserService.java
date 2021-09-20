package com.clausweb.course.services;
import java.util.List;
import java.util.Optional;

import com.clausweb.course.entities.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.clausweb.course.repositories.UserRepository;


@Service
public class UserService {
	
	@Autowired 
	private UserRepository repository;
	
	public List<User> findAll(){
		
	return repository.findAll();	
		
	
	}
	
	public User FindById(Long id) {
		Optional <User> obj = repository.findById(id);
		return obj.get(); //retorna get dentro do obj <USER>
		
	}
	
	
	public User insert(User obj) {
		
		return  repository.save(obj);
		
	}
	
	
	
	

}
