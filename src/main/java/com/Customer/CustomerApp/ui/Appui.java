package com.Customer.CustomerApp.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Customer.CustomerApp.Service.ICustomerService;
import com.Customer.CustomerApp.dto.Customer;
@Component
public class Appui {
	@Autowired
	private ICustomerService service;
	public void runui()
	{
		Customer c=new Customer();
		c.setId(200L);
		c.setName("Sahitya");
		Customer c1=new Customer();
		c1.setId(220L);
		c1.setName("saisri");
		service.add(c);
		service.add(c1);
		
	}

}
