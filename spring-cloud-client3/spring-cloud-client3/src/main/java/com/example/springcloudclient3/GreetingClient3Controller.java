package com.example.springcloudclient3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class GreetingClient3Controller 
{
	@Value("${my.greeting:default value}")
	private String greetingMessage;
	
	@RequestMapping("/greeting")
	public String getGreeting(){
		return "my.greeting==="+greetingMessage;
	}
	
	@RequestMapping("/hello")
	public String hello(){
		return "my.greeting==="+greetingMessage;
	}
}
