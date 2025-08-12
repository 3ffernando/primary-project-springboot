package com._ftech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com._ftech.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
