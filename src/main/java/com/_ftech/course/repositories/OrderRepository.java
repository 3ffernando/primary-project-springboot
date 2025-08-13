package com._ftech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com._ftech.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
