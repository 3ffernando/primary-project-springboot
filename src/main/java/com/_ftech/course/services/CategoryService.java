package com._ftech.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com._ftech.course.entities.Category;
import com._ftech.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	//ADD DEPENDENCIA DO USERRESPOSITORY;
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		
		return obj.get();
	}
	
	
}
