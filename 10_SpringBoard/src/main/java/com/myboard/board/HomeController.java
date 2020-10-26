package com.myboard.board;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.myboard.dto.BoardDTO;
import com.myboard.model.BoardService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private BoardService service;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@GetMapping("boardInsert")
	public String insert() {
		return "boardinsert";
	}
	
	@PostMapping("boardInsert")
	public String insert(BoardDTO board) {
		service.insert(board);
		return "redirect:boardlist";
	}
	
	@RequestMapping("boardlist")
	public void list(Model model,String field,String word){
		HashMap<String, Object>hm = new HashMap<String,Object>();
		hm.put("field",field);
		hm.put("word", word);
		List<BoardDTO>plist = service.findAll(hm);
		model.addAttribute("board",plist);
	}
	
	@RequestMapping("boarddetail")
	public void view(Model model,int num) {		
		BoardDTO board = service.findByNum(num);
		model.addAttribute("board",board);
	}
	
	@RequestMapping("boardupdate")
	public String update(BoardDTO board) {
		service.update(board);
		return "redirect:boardlist";
		
	}
	
	@RequestMapping("boarddelete")
	public String delete(int num) {
		service.delete(num);
		return "redirect:boardlist";
	}
	
	
	
	
	
	
	
	
	
	
	
}
