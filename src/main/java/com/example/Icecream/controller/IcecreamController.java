package com.example.Icecream.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Icecream.entity.Icecream;
import com.example.Icecream.entity.Login;
import com.example.Icecream.entity.order;
import com.example.Icecream.service.IcecreamService;
import com.example.Icecream.service.OrderService;

@Controller

public class IcecreamController {
	
	@Value("${login.username}")
	private String userName;
	
	@Value("${login.password}")
	private String password;
	
	private IcecreamService  icecreamService;
	private OrderService orderservice;
	
	public IcecreamController(IcecreamService icecreamService ,OrderService orderservice) {
		super();
		this.icecreamService = icecreamService;
		this.orderservice= orderservice;
	}
	
	@GetMapping("/")
	public String indexPage() {
		return "index";
	}
	@GetMapping("/fruitnut")
	public String fruit(Model model) {
		model.addAttribute("fruit",new Icecream());
		return "Fruit&Nuts";
	}
	@GetMapping("/indianinspiration")
	public String indinsp(Model model) {
		model.addAttribute("indianinsp",new Icecream());
		return "Indian Inspiration";
	}
	@GetMapping("/contact")
	public String listIcecream(Model model) {
		// Icecream theIcecream = new Icecream();
		model.addAttribute("icecream", new Icecream());
		return "contact";
	}
	
	@PostMapping("/save")
	public String saveForm(@ModelAttribute("icecream") Icecream icecream) {
		
		icecreamService.save(icecream);
		//return "redirect:/orderform";
		return "customerList";
	}
	
	@RequestMapping("/customerlist")
	public String customerList(Model model) {
		List<Icecream> theicecream =icecreamService.findAll();
		model.addAttribute("icecream",theicecream);
		return "customerList";
	}
	
	
	@RequestMapping("/deletecustomer")
	public String customerDelete(@RequestParam("Id") int theId) {
		icecreamService.deleteById(theId);
		return "redirect:/customerlist";
	}
	
	
	@RequestMapping("/orderform")
	public String listorder(Model model) {
		order theOrder = new order();
		model.addAttribute("order",theOrder);
		return "form";
	}
	
	
	@RequestMapping("/ordersave")
	public String saveorderfaorm(@ModelAttribute("order") order theorder, Model theModel ) {
		System.out.println(theorder);
		
		//calcualte total bil
		int totalPrice = theorder.getChocochipsquantity()*theorder.getChocochipsrate() + 
					theorder.getCoconutquantity()* theorder.getCoconutrate() +
					theorder.getGajarhalwaquantity()*theorder.getGajarhalwarate()+
					theorder.getKalajamunquantity()*theorder.getKalajamunrate()+ theorder.getMangoquantity()*theorder.getMangorate()+
					theorder.getMixberriesquantity()*theorder.getMixberriesrate()+
					theorder.getMotichoorquantity()*theorder.getMotichoorrate()+
					theorder.getPistaquantity()*theorder.getPistarate()+theorder.getSheerkhurmaquantity()*theorder.getSheerkhurmarate()+
					theorder.getStrawberryquantity()*theorder.getStrawberryrate();	
		// call setprice method to save data
		theorder.setTotalprice(totalPrice);
		orderservice.save(theorder);
		
		theModel.addAttribute("tempCustomer",theorder);				
		return "orderlist";
		
	}
	
	@RequestMapping("/orderlist")
	public String orderList(Model model) {
		List<order> theorder = orderservice.findAll();
		model.addAttribute("order",theorder);
		return "orderlist";
		
	}
	
@RequestMapping("/showLogin")
	
	public String showLogin(Model theModel) {
		theModel.addAttribute("login" ,new Login());
		return "login_form";
	}
	
	@RequestMapping("/submitLogin")
	
	public String showList(@ModelAttribute("login") Login login, Model theModel) {
		
		System.out.println(login);
		System.out.println("username : "+userName + " Password:"+password);
		if(userName.equals(login.getUsername())) {
		
			List<Icecream> theicecream =icecreamService.findAll();
			theModel.addAttribute("icecream",theicecream);
			return "customerList";
		
		}
		else {
			return "login_form";
		}
	}
}
