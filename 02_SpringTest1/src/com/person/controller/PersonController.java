package com.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.person.model.PerDAOImpl;
import com.person.model.Person;

@Controller
public class PersonController {
	@Autowired
	private PerDAOImpl dao;
	
	//�߰���
	//mapping value="personForm.go",method=RequestMethod.Get or Post)
	@RequestMapping("personForm.go")
	public String form() {
		return "personForm";
	}
	
	//�߰�
	@RequestMapping("personInsert.go")
	public String insert(Person p) {
		dao.perInsert(p);
		return "redirect:personlist.go";
	}
	
	//��ü����
	@RequestMapping("personlist.go")
	public ModelAndView perList(){
		ModelAndView mv = new ModelAndView();
		List<Person>userlist = dao.perList();
		mv.addObject("userlist",userlist);
		mv.setViewName("personList");
		return mv;
	}
	
	//�󼼺���
	@RequestMapping("personView.go")
	public ModelAndView view(String id) {
		Person person = dao.perView(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",person);
		mv.setViewName("personView");
		return mv;
	}
	
	//����
	@RequestMapping("personDelete.go")
	public String delete(String id) {
		dao.perDelete(id);
		return "redirect:personlist.go";
	}
	
	//������
	@RequestMapping(value="updateForm.go")
	public String update(Model model,String id) {
		Person person = dao.perView(id);
		model.addAttribute("user",person);
		return "updateForm";
	}
	
	//����
	@RequestMapping("personUpdate.go")
	public String update(Person p) {
		dao.PerUpdate(p);
		return "redirect:personlist.go";
	}
	
}
