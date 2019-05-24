package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.Person;
import com.example.demo.repository.PersonRepository;

@RestController
public class HomeController {
	@Autowired
	PersonRepository personRepository;
	@CrossOrigin
	@RequestMapping("/")
	public List<Person> index(){
		return personRepository.findAll();
	}
}
