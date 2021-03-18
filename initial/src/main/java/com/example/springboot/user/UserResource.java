package com.example.springboot.user;

import java.util.*;
import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	@Autowired
	private UserDaoService service;

	@GetMapping("/users")
	public List<User> getAllUsers(){
		return service.findAllUsers();
	}

	@GetMapping("/users/{id}")
	public User getUser(@PathVariable int id){
		User user = service.findUser(id);
		if(user==null)
			throw new UserNotFoundException("id-"+ id);
		return user;
	}
	
	@PostMapping("/users")
	public ResponseEntity<Object> getUser(@RequestBody User user){
		User savedUser = service.addUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(savedUser.getId())
			.toUri();
		return ResponseEntity.created(location).build();
	}


}

