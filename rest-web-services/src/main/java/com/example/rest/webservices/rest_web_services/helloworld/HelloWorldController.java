package com.example.rest.webservices.rest_web_services.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController 
{
	private MessageSource msgsrc;
	
	
	
	public HelloWorldController(MessageSource msgsrc) {
		
		this.msgsrc = msgsrc;
	}

	@GetMapping(path="/hallo")
	public String helloworld()
	{
		return "Hallo :-)";
	}
	
	@GetMapping(path="/hallo-Bean")
	public HelloWorldBean helloworldBean()
	{
		return new HelloWorldBean("Hallo :-)");
	}
	
	@GetMapping(path="/hallo-Bean/pv/{name}")
	public HelloWorldBean helloworldPV(@PathVariable String name)
	{
		return new HelloWorldBean("Hallo "+name);
	}
	
	@GetMapping(path="/hallo-i18n")
	public String helloworldi18n()
	{
		Locale loc = LocaleContextHolder.getLocale();
		return msgsrc.getMessage("good.morning.message",null,"Default Message",loc);
	}

	  
}
