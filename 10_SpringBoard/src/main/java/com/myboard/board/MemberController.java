package com.myboard.board;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myboard.dto.MemberDTO;
import com.myboard.model.MemberService;

@RequestMapping("/member/*")
@Controller
public class MemberController {
	@Autowired
	MemberService mservice;
	
	@GetMapping("join")
	public String home() {
		return "join";
	}
	
	@PostMapping("join")
	public String insert(MemberDTO member) {
		mservice.insert(member);
		return "login";
	}
	
	@GetMapping("login")
	public String login() {
		return "login";
	}
	
	@PostMapping("login")
	@ResponseBody
	public String logincheck(HttpServletRequest requset,String id,String pass) {
		MemberDTO member= mservice.Login(id, pass);
		
		String retStr="";
		if(member==null) {
			retStr="no";
		}else if(member.getPass().equals(pass)) {
			HttpSession session = requset.getSession();
			session.setAttribute("id",id);
			retStr="success";
		}else {
			retStr="passError";
		}
		return retStr;
		
	}
	
}
