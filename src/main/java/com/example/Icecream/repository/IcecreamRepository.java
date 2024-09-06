package com.example.Icecream.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Icecream.entity.Icecream;

public interface IcecreamRepository extends JpaRepository<Icecream, Integer>{

}
