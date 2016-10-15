package com.luckyakhi.springdemo.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luckyakhi.springdemo.springbootdemo.model.Response;
  
@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
  	public Response  getHome(String name){
		Response response = new Response();
		response.setStatus("OK");
		return response;
	}
}
 