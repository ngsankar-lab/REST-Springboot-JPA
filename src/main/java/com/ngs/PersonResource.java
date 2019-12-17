package com.ngs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonResource {
	
	@Autowired
	PersonRepository repo;
	
	@GetMapping("persons")
	public List<Person> getPersons(){
		
		List<Person> persons=(List<Person>) repo.findAll();
		return persons;
}
}
