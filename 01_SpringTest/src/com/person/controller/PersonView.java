package com.person.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.person.model.PersonDAOImpl;
import com.person.model.PersonDTO;


public class PersonView extends AbstractController{
	private PersonDAOImpl dao;
	
	public void setDao(PersonDAOImpl dao) {
		this.dao = dao;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String id = req.getParameter("id");
		PersonDTO person = dao.findById(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("user",person);
		mv.setViewName("WEB-INF/jsp/personView.jsp");
		return mv;
	}

}
