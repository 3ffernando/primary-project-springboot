package com._ftech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com._ftech.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
