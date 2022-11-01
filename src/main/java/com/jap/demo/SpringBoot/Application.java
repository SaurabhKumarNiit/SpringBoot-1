package com.jap.demo.SpringBoot;

import com.jap.demo.SpringBoot.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		ApplicationContext context=SpringApplication.run(Application.class, args);

		MessageService messageService=context.getBean("messageService", MessageService.class);
		System.out.println(messageService.greet());

	}

}
