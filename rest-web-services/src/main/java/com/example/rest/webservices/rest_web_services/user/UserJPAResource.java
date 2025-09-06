package com.example.rest.webservices.rest_web_services.user;


import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.rest.webservices.rest_web_services.jpa.UserRepo;

import jakarta.validation.Valid;


@RestController
public class UserJPAResource 
{
	//private UserDaoService service;
	
	 private UserRepo repo;
	 
	public UserJPAResource( UserRepo repo) {
		
		//this.service = service;
		this.repo = repo;
	}
	
	@GetMapping("/jpa/users")
	public List<User> retrieveall()
	{
		return repo.findAll();
	}
	
	@GetMapping("/jpa/users/{id}")
	public EntityModel<User> retrieveUser(@PathVariable int id)
	{
		 Optional<User> user = repo.findById(id);
		 
		 if(user.isEmpty())
			 throw new UserNotFoundException("id:"+id);
		 
		 WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveall());
		 
		 EntityModel<User> entitymodel = EntityModel.of(user.get());
		 
		 entitymodel.add(link.withRel("all-users"));
		 return entitymodel;
	}
	
	@PostMapping("/jpa/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user)
	{
		User savedUser = repo.save(user);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/jpa/users/{id}")
	public void deleteUser(@PathVariable int id)
	{
		 repo.deleteById(id);
		 
	}
	

}
