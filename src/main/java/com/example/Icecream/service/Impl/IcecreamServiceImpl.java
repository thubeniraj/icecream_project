package com.example.Icecream.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Icecream.entity.Icecream;
import com.example.Icecream.repository.IcecreamRepository;
import com.example.Icecream.service.IcecreamService;
@Service
public class IcecreamServiceImpl implements IcecreamService{

	private IcecreamRepository icecreamRepository;
	
	public IcecreamServiceImpl(IcecreamRepository icecreamRepository) {
		super();
		this.icecreamRepository = icecreamRepository;
	}


	

	@Override
	public void save(Icecream icecream) {
		// TODO Auto-generated method stub
		icecreamRepository.save(icecream);
	}


	@Override
	public List<Icecream> findAll() {
		// TODO Auto-generated method stub
		return icecreamRepository.findAll();
	}




	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		icecreamRepository.deleteById(theId);
	}

}
