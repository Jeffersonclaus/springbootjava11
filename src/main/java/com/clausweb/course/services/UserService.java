package com.clausweb.course.services;

import java.util.List;
import java.util.Optional;

import com.clausweb.course.entities.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.clausweb.course.repositories.UserRepository;
import com.clausweb.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {

		return repository.findAll();

	}

	public User FindById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id)); // Tenta encontrar id,se nao encontrar,  
																		//	manda p/ o metodo de excessao
	}

	public User insert(User obj) {

		return repository.save(obj);

	}

	public void delete(Long id) {

		repository.deleteById(id);

	}
	
	public User update(Long id , User obj) {
		User entity = repository.getOne(id);
		updateDate(entity, obj);
		return repository.save(entity);
		
	}

	private void updateDate(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	} 
	
	
	
	
	

}
