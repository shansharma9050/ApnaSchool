package com.example.demo.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class JWTSecurityRestController {
 
	@RequestMapping(value = "/getList")
	public String getData()
	{
		return "";
	}
	
	@RequestMapping(value = "/saveData")
	public String saveData()
	{
		return "";
	}
	
	@RequestMapping(value = "/editData")
	public String editData()
	{
		return "";
	}
}
