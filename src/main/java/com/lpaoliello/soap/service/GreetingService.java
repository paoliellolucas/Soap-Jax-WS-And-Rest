package com.lpaoliello.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.lpaoliello.soap.model.Greeting;

@WebService(serviceName = "GreetingService")
public interface GreetingService {
 
	@WebMethod()
	@WebResult(name = "Greeting")
	public Greeting sayHello(@WebParam(name = "GreetingsRequest") String name);
 
	@WebMethod()
	@WebResult(name = "Greeting")
	public Greeting sayBye(@WebParam(name = "GreetingsRequest") String name);
}