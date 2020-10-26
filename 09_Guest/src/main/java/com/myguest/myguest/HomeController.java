package com.myguest.myguest;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.myguest.model.GuestBookDTO;
import com.myguest.model.GuestBookService;
import com.myguest.model.GuestListVO;
import com.myguest.util.PageAction;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired 
	GuestBookService service;
	@Autowired
	PageAction page;
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "insert";
	}
	
	//전체보기
	@GetMapping("gList")
	@ResponseBody
	public GuestListVO list(String pageNum,String field,String word) {
		HashMap<String, Object>hm = new HashMap<String, Object>();
		hm.put("field", field);
		hm.put("word", word);
		int count = service.countGuest(hm);
		
		int pageSize = 5;
		if(pageNum==null)pageNum="1";
		int currentPage = Integer.parseInt(pageNum);
		
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = startRow+pageSize-1;
		if(endRow>count)endRow=count;
		
		hm.put("startRow", startRow);   
		hm.put("endRow", endRow);
		
		List<GuestBookDTO>list= service.list(hm);
		
		String pageHtml
		=page.paging(count,pageSize,currentPage,field,word);
		//PageAction paging = new PageAction 과 같음
		
		GuestListVO listvo = new GuestListVO(count, list, pageHtml);
		
		return listvo;
	}
	
	//상세보기
		@GetMapping("gView")
		@ResponseBody
		public GuestBookDTO view(int num) {		
			return service.findByNum(num);
		}
	
	
	//삭제
	@GetMapping("gDelete")
	@ResponseBody
	public String delete(int num) {
		service.deleteGuest(num);
		return "success";
	}
	
}
