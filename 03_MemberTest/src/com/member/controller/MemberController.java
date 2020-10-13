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
	
	//�߰� ��
	@RequestMapping("member_form.me")
	public String form() {
		return "memberform";
	}
	
	//�߰�
	@RequestMapping("member_insert.me")
	public String insert(Member member) {
		dao.insert(member);
		return "redirect:member_list.me";
	}
	
	//��ü����
	@RequestMapping("member_list.me")
	public ModelAndView memList() {
		ModelAndView mv = new ModelAndView();
		List<Member>memberlist = dao.getMemberList();
		mv.addObject("member",memberlist);
		mv.setViewName("memberlist");
		return mv;
	}
	
	//�󼼺���
	@RequestMapping("memberView.me")
	public ModelAndView view(String id) {
		Member member = dao.findById(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("member",member);
		mv.setViewName("memberView");
		return mv;
	}
	
	//����
	@RequestMapping("memberDelete.me")
	public String delete(String id) {
		dao.delete(id);
		return "redirect:memberlist.me";
	}
	
	//������
	@RequestMapping("updateForm.me")
	public String updateForm(Model model,String id) {
		Member member = dao.findById(id);
		model.addAttribute("member",member);
		return "updateForm";
	}
	
	//����
	@RequestMapping("memberUpdate.me")
	public String update(Member member) {
		dao.update(member);
		return "redirect:member_list.me";
	} 
}
