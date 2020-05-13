package com.java5Lab2;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Transactional
public class StudentController {
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String showForm() {
		return "student/form";

	}

	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public String save(HttpServletRequest request) {
		
		String name = request.getParameter("namesv");
		String mark = request.getParameter("mark");
		String major = request.getParameter("major");
		request.setAttribute("namesv", name);
		request.setAttribute("mark", mark);
		request.setAttribute("major", major);
		return "student/success";
	}
}
