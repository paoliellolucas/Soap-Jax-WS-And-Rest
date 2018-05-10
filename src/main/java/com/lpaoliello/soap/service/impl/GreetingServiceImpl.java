package com.lpaoliello.soap.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.lpaoliello.soap.model.Greeting;
import com.lpaoliello.soap.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {
 
	@Override
	public Greeting sayHello(String name) {
		Greeting greeting = new Greeting();
		greeting.setMessage("Hello " + name + "!!!");
		greeting.setDate(new Date());
		return greeting;
	}
 
	@Override
	public Greeting sayBye(String name) {
		Greeting greeting = new Greeting();
		greeting.setMessage("Bye " + name + "!!!");
		greeting.setDate(new Date());
		return greeting;
	}
}
