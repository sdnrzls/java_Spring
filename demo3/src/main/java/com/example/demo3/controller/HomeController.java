package com.example.demo3.controller;

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

import com.example.demo3.model.Member;
import com.example.demo3.service.MemberService;

@Controller
public class HomeController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/")
	public String index() {
		return "home";
	}
	@GetMapping("mInsert")
	public String mInsert() {
		return "insert";
	}
	@PostMapping("mInsert")
	public String mInsert(Member member) {
		memberService.save(member);
		return"redirect:list";
	}
	
	@GetMapping("list")
	public String list(Model model,
		@PageableDefault(size=3,sort="id",
		direction=Sort.Direction.DESC)Pageable pageable) {
//		List<Member> mlist = memberService.list();
		Page<Member>mlist=memberService.list(pageable);
		model.addAttribute("list",mlist);
		return "list";
	}
	
	@GetMapping("{id}")
	public String detail(Model model,@PathVariable Long id) {
		Member member = memberService.detail(id);
		model.addAttribute("member",member);
		return "detail";
	}
	
	//삭제
	@DeleteMapping("{id}")
	@ResponseBody
	public String delete(@PathVariable Long id) {
		memberService.delete(id);
		return id.toString();
	}
	
	
	@GetMapping("{id}/update")
	public String update(Model model,@PathVariable Long id) {
		Member member = memberService.detail(id);
		model.addAttribute("member",member);
		return "update";
	}
	
	//수정
	@PutMapping("update/{id}")
	@ResponseBody
	public String update(@PathVariable Long id,
			@RequestBody Member member) {
		System.out.println("addr : " + member.getAddr());
		System.out.println("id : " + member.getId());
		System.out.println("name : " + member.getName());
		memberService.update(member);
		return id.toString();
	}
	
	
	
}
