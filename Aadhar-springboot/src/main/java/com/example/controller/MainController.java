package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Admin;
import com.example.entities.People;
import com.example.entities.User;
import com.example.exception.AdminNotFoundException;
import com.example.exception.PeopleNotFoundException;
import com.example.exception.UserNotFoundException;
import com.example.repository.AdminRepository;
import com.example.repository.PeopleRepository;
import com.example.repository.UserRepository;

@RestController
public class MainController {

	@Autowired
	private AdminRepository adminrepository;

	@Autowired
	private UserRepository userrepository;

	@Autowired
	private PeopleRepository peoplerepository;

	// Admin
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/admin")
	public Iterable<Admin> getAdmin() {
		return adminrepository.findAll();
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/admin/{id}")
	public Admin getAdmin(@PathVariable("id") Integer id) {
		Optional<Admin> optAdmin = adminrepository.findById(id);
		if (optAdmin.isPresent()) {
			
			return optAdmin.get();
		}
		throw new AdminNotFoundException(id);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/admin")
	public Admin create(@RequestBody Admin admin) {
		return adminrepository.save(admin);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/admin")
	public Admin update(@RequestBody Admin admin) {
		return adminrepository.save(admin);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/admin/{id}")
	public void deleteadmin(@PathVariable("id") Integer id) {
		adminrepository.deleteById(id);
	}

	// User
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/user")
	public Iterable<User> getUser() {
		return userrepository.findAll();
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") Integer id) {
		Optional<User> optUser = userrepository.findById(id);
		if (optUser.isPresent()) {
			
			return optUser.get();
		}
		throw new UserNotFoundException(id);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/user")
	public User create(@RequestBody User user) {
		return userrepository.save(user);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/user")
	public User update(@RequestBody User user) {
		return userrepository.save(user);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/user/{id}")
	public void deleteuser(@PathVariable("id") Integer id) {
		userrepository.deleteById(id);
	}

	// People
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/people")
	public Iterable<People> getPeople() {
		return peoplerepository.findAll();
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/people/{id}")
	public People getPeople(@PathVariable("id") Integer id) {
		Optional<People> optPeople = peoplerepository.findById(id);
		if (optPeople.isPresent()) {
			
			return optPeople.get();
		}
		throw new PeopleNotFoundException(id);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/people")
	public People create(@RequestBody People citi) {
		return peoplerepository.save(citi);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/citizens")
	public People update(@RequestBody People citi) {
		return peoplerepository.save(citi);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/people/{id}")
	public void deleteciti(@PathVariable("id") Integer id) {
		peoplerepository.deleteById(id);
	}

}


