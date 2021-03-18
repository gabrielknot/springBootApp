package com.example.springboot.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	@GetMapping("/hello-bean")
	public HelloBean helloBean() {
		return new HelloBean("Hello bean");
	}

	@GetMapping("/hello-bean/path-variable/{name}")
	public HelloBean helloBeanPathVariable( @PathVariable("name") String name) {
		return new HelloBean(String.format("Hello bean, %s",name));
	}
}
