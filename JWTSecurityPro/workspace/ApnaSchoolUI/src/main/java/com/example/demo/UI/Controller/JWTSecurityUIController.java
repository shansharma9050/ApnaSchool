package com.example.demo.UI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/Apna_School_UI")
public class JWTSecurityUIController {

	@RequestMapping(value = "/getHTML")
	public String getHTMLDetails()
	{
		return "admin-panel";
		
	}
	@RequestMapping(value = "/getRegister")
	public String getRegisterDetails()
	{
		return "registeration";
		
	}
	@RequestMapping(value = "/getLogin")
	public String getLoginDetails()
	{
		return "login";
		
	}
	@RequestMapping(value = "/saveData")
	public String getSaveDetails()
	{
		
		return "registeration";
		
	}
	

	
}
