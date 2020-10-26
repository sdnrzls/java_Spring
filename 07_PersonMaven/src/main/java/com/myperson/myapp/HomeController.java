package com.myperson.myapp;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myperson.model.Person;
import com.myperson.model.PersonService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired 
	private PersonService service;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "home";
	}
	
	@GetMapping("personInsert")
	public String insert() {
		return "personInsert";
	}
	
	@PostMapping("personInsert")
	public String insert(Person person) {
		service.person_insert(person);
		return "redirect:personList";
	}
	
	@RequestMapping("personList")
	public void list(Model model,String field,String word) {
	HashMap<String, String>hm = new HashMap<String, String>();
	hm.put("field",field);
	hm.put("word", word);
		List<Person>plist = service.person_list(hm);
		model.addAttribute("user",plist);
	}
	
	@RequestMapping(value={"personView","updateForm"})
	public void view(Model model,String id) {
		Person person = service.person_detail(id);
		model.addAttribute("user",person);
	}
	
	@RequestMapping("personUpdate")
	public String update(Person person) {
		service.person_update(person);
		return "redirect:personList";
	}
	
	@RequestMapping("personDelete")
	public String delete(String id){
		service.person_delete(id);
		return "redirect:personList";
	}
	
	
	
	
	
	
	
	
}
