package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Signup;
import com.example.demo.service.AdminService;


@Controller
public class HomeController {
	
	@Autowired
	private AdminService Aservice;
	
	//시작페이지
	@GetMapping("/")
	public String index() {
		return "redirect:list";
	}
	//회원가입 폼
	@GetMapping("signup")
	public String signup() {
		return "insert";
	}
	//회원가입
	@PostMapping("signup")
	public String signup(Signup admin) {
		Aservice.save(admin);
		return "redirect:list";
	}
	//리스트폼, 페이지
	@GetMapping("list")
	public String list(Model model, @PageableDefault(size = 3,sort="id",
	direction = Sort.Direction.DESC) Pageable pageable) {
		Page<Signup> slist=Aservice.list(pageable);
		model.addAttribute("list", slist);
		return "list";
	}
	//상세보기
	@GetMapping("{id}")
	public String finById(@PathVariable String id, Model model) {
		model.addAttribute("list", Aservice.detail(id));
		return"view";
	}
	//수정하기 폼
	@GetMapping("{id}/update")
	public String update(@PathVariable String id,Model model) {
		model.addAttribute("list", Aservice.detail(id));
		return "update";
	}
	//수정하기
	@PutMapping("update/{id}")
	@ResponseBody
	public String update(@PathVariable String id, @RequestBody Signup signup) {
		Aservice.update(signup);
		return id.toString();
	}
	//삭제하기
	@DeleteMapping("{id}")
	@ResponseBody
	public String delete(@PathVariable String id) {
		Aservice.delete(id);
		return id.toString();
	}
}
