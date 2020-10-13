package org.person.controller;

import java.util.List;

import org.person.model.PersonServiceImpl;
import org.person.model.PersonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PerController {
	@Autowired
	private PersonServiceImpl service;
	
	@RequestMapping("personForm.go")
	public String Form() {
		return "personForm";
	}
	
	//추가
	@RequestMapping("personInsert.go")
	public String insert(PersonVO person) {
		service.person_insert(person);
		return "redirect:personlist.go";
		}
	
	//보기
	@RequestMapping("personlist.go")
	public String perList(Model model) {
		List<PersonVO>userlist = service.person_list();
		model.addAttribute("user",userlist);
		return "personList";
	}
	
	//상세보기,수정폼
	@RequestMapping(value={"updateForm.go","personView.go"})
	public void view(Model model,String id) {
		PersonVO person = service.person_detail(id);
		model.addAttribute("user",person);
	}
	
	//삭제
	@RequestMapping("personDelete.go")
	public String delete(String id) {
		service.person_delete(id);
		return "redirect:personlist.go";
	}

	//수정
	@RequestMapping("personUpdate.go")
	public String update(PersonVO person) {
		service.person_update(person);
		return "redirect:personlist.go";
	}
	
}
