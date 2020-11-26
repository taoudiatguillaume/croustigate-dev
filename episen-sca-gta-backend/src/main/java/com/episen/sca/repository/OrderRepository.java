package com.episen.sca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.episen.sca.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}