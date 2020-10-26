package com.guest.guest;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.guest.model.GuestService;
import com.guest.util.PageAction;
import com.guest.vo.GuestVO;

@Controller
public class GuestController {
	@Autowired
	private GuestService service;
	@Autowired
	private PageAction page;
	
	
	@GetMapping("gInsert")
	public String insert() {
		return "insert";
	}
	
	@PostMapping("gInsert")
	public String insert(HttpServletRequest req, GuestVO guest) {
		guest.setIpaddr(req.getRemoteAddr());
		service.insert(guest);
		return "redirect:gList";
	}
	
	@RequestMapping("gList")
	public String list(Model model,String pageNum,String field,String word) {
		HashMap<String, Object>hm = new HashMap<>();
		hm.put("field", field);
		hm.put("word", word);
		
		int count = service.count(hm);
		int pageSize = 5; //한 화면에 보여지는 수
		if(pageNum==null)pageNum="1";
		int currentPage = Integer.parseInt(pageNum);
		
		int startRow = (currentPage-1)*pageSize+1;
		int endRow = startRow+pageSize-1;
		if(endRow>count)endRow=count;
		
		hm.put("startRow",startRow);
		hm.put("endRow", endRow);
		
		String pageHtml//[이전]4,5,6[다음]
		= page.paging(count,pageSize,currentPage,field,word);
		
		List<GuestVO>glist = service.list(hm);
		model.addAttribute("count",count);
		model.addAttribute("guest",glist);
		model.addAttribute("pageHtml",pageHtml);
		return "list";
	}
	
	//상세보기
	@GetMapping(value="gView",
			produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String view (@RequestParam("num")int num) {
		GuestVO guest = service.view(num);
		JSONObject obj = new JSONObject();
		obj.put("name",guest.getName());
		obj.put("content",guest.getContent());
		obj.put("grade",guest.getGrade());
		obj.put("ipaddr",guest.getIpaddr());
		obj.put("created",guest.getCreated());
		return obj.toString();
	}
	
	@GetMapping("gDelete")
	public String delete(int num) {
		service.delete(num);
		return "redirect:gList";
	}
	
	
	
	
	
}
