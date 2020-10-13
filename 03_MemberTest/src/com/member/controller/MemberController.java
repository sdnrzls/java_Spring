package com.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.member.model.Member;
import com.member.model.MemberDAOImpl;

@Controller
public class MemberController {
	@Autowired
	private MemberDAOImpl dao;
	
	//추가 폼
	@RequestMapping("member_form.me")
	public String form() {
		return "memberform";
	}
	
	//추가
	@RequestMapping("member_insert.me")
	public String insert(Member member) {
		dao.insert(member);
		return "redirect:member_list.me";
	}
	
	//전체보기
	@RequestMapping("member_list.me")
	public ModelAndView memList() {
		ModelAndView mv = new ModelAndView();
		List<Member>memberlist = dao.getMemberList();
		mv.addObject("member",memberlist);
		mv.setViewName("memberlist");
		return mv;
	}
	
	//상세보기
	@RequestMapping("memberView.me")
	public ModelAndView view(String id) {
		Member member = dao.findById(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("member",member);
		mv.setViewName("memberView");
		return mv;
	}
	
	//삭제
	@RequestMapping("memberDelete.me")
	public String delete(String id) {
		dao.delete(id);
		return "redirect:memberlist.me";
	}
	
	//수정폼
	@RequestMapping("updateForm.me")
	public String updateForm(Model model,String id) {
		Member member = dao.findById(id);
		model.addAttribute("member",member);
		return "updateForm";
	}
	
	//수정
	@RequestMapping("memberUpdate.me")
	public String update(Member member) {
		dao.update(member);
		return "redirect:member_list.me";
	} 
}
