package com.myboard.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myboard.dto.CommentDTO;
import com.myboard.model.CommentService;

@RequestMapping("/reply")
@RestController
public class Commentcontroller {
	@Autowired
	private CommentService cservice;
	
	@GetMapping("/commentList")
	public List<CommentDTO>list(int bnum) {
		List<CommentDTO>clist =cservice.getList(bnum);
		return clist;
	}
	
	//¥Ò±€√ﬂ∞°
	@PostMapping("/commentInsert")
	public String insert(@RequestBody CommentDTO cnt) {
		 cservice.insert(cnt);
		 return "redirect:commentList";
	}
	
	//¥Ò±€ªË¡¶
	@DeleteMapping(value ="/del/{cnum}")
	public String del(@PathVariable int cnum){
		cservice.delete(cnum);
		return "sucess";
	}
	
}
