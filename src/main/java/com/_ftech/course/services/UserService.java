package com._ftech.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com._ftech.course.entities.User;
import com._ftech.course.repositories.UserRepository;

@Service
public class UserService {
	
	//ADD DEPENDENCIA DO USERRESPOSITORY;
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		
		return obj.get();
	}
	
	
}
