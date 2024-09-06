package com.example.Icecream.service;

import java.util.List;

import com.example.Icecream.entity.order;

public interface OrderService {
void save(order theorder);

List<order> findAll();
}

