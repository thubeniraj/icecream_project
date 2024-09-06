package com.example.Icecream.service;

import java.util.List;

import com.example.Icecream.entity.Icecream;

public interface IcecreamService {
List<Icecream> findAll();
void deleteById(int theId);
void save(Icecream icecream);
}
