package com.example.Icecream.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Icecream.entity.order;

public interface OrderRepository extends JpaRepository<order, Integer>{

}
