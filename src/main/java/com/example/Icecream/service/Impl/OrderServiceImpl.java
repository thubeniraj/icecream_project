package com.example.Icecream.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Icecream.entity.order;
import com.example.Icecream.repository.OrderRepository;
import com.example.Icecream.service.OrderService;

import jakarta.persistence.EntityManager;
@Service
public class OrderServiceImpl implements OrderService{
	
@Autowired
private OrderRepository theorderRepository;
private EntityManager entitymanager;


@Autowired
public OrderServiceImpl (OrderRepository theReporder,EntityManager entitymanager)
{
	theReporder=theorderRepository;
	}
	@Override
	public void save(order theorder) {
		
		 theorderRepository.save(theorder);
	}
	@Override
	public List<order> findAll() {
		// TODO Auto-generated method stub
		return theorderRepository.findAll();
	}

}
