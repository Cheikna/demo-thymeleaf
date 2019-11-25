package com.architectureAppWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.architectureAppWeb.repository.PersonRepository;

@Controller
public class PersonController {
	
	@Autowired
	private PersonRepository personRepo;
	
	@Value("${course}")
	private String courseName;

	@GetMapping("/persons")
    private String findAllPerson(Model model){
		model.addAttribute("persons", personRepo.findAll());
		model.addAttribute("courseName", courseName);
        return "index";
    }

}
