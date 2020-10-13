package com.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.member.model.MemberService;
import com.member.model.MemberVO;

@Controller
public class MemberController {
	@Autowired
	private MemberService mService;
	
	//�Է���
	@RequestMapping("insert.my")
	public void form() {
		
	}
	//�Է�
	@RequestMapping("memberinsert.my")
	public String insert(MemberVO member) {
		mService.insert(member);
		return "redirect:memberlist.my";
	}
	//��ü����
	@RequestMapping("memberlist.my")
	public void list(Model model) {
		List<MemberVO>mlist=mService.list();
		model.addAttribute("member",mlist);
	}
	//�󼼺���,������
	@RequestMapping(value={"memberView.my","updateForm.my"})
	public void view(Model model,String id) {
		MemberVO member = mService.view(id);
		model.addAttribute("member",member);
	}
	//����
	@RequestMapping("memberDelete.my")
	public String delete(String id) {
		mService.delete(id);
		return "redirect:memberlist.my";
	}
	//����
	@RequestMapping("memberUpdate.my")
	public String update(MemberVO member) {
		mService.update(member);
		return "redirect:memberlist.my";
	}
	
	
	
	
}
