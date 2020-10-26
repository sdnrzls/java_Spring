package com.member.mytest;


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
import org.springframework.web.bind.annotation.ResponseBody;

import com.member.mymodel.MemberService;
import com.member.mymodel.MemberVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private MemberService service;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "home";
	}
	
	@GetMapping("insert")
	public String insert() {
		return "insert";
	}
	
	@PostMapping("insert")
	public String insert(MemberVO member) {
		service.insert(member);
		return "redirect:memberlist";
	}
	
	@RequestMapping("memberlist")
	public void list(Model model,
			@RequestParam(value="field", required=false)String field,
			@RequestParam(value="word", required=false)String word) {
		HashMap<String, String>hm = new HashMap<String, String>();
		hm.put("field",field);
		hm.put("word", word);
		List<MemberVO>mlist = service.list(hm);
		model.addAttribute("member",mlist);
	}
	
	@GetMapping("sample1")
	@ResponseBody
	public String sample() {
		return "success";
	}
	
	@RequestMapping(value={"memberView","updateForm"})
	public void view(Model model,String id) {
		MemberVO member = service.findById(id);
		model.addAttribute("member",member);
	}
	
	@RequestMapping("memberDelete")
	public String delete(String id) {
		service.delete(id);
		return "redirect:memberlist";
	}
	
	@RequestMapping("memberUpdate")
	public String update(MemberVO member) {
		service.update(member);
		return "redirect:memberlist";
	}
	
	
	
	
	
	
	
	
	
	
	
}
