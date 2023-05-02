package com.codewave.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codewave.demo.controller.impl.HelloworldController;

@SpringBootApplication
public class DemoHellowordApplication {

	public static void main(String[] args) {
		// start application
		SpringApplication.run(DemoHellowordApplication.class, args);
		String a = "hello";
		a = "hello4";
		System.out.println(a);
		// after a point to "hello2", "hello" will be removed after a certain period
		HelloworldController controller = new HelloworldController();
		System.out.println(controller.sayHello());
	}

}
