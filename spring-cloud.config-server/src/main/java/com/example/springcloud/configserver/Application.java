package com.example.springcloud.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = { RabbitAutoConfiguration.class })
@EnableConfigServer
@ComponentScan(basePackageClasses = {DbSettings.class})
public class Application {
	
	public static void main(String[]args) 
	{
		SpringApplication.run(Application.class,args);
	}
}

