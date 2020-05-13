package com.java5Lab2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.java5Lab2.Student;
@Controller
@RequestMapping("/student-mgr")
public class StudentMgrController {
	@RequestMapping()
	public String index(ModelMap modelmap) {
		modelmap.addAttribute("message", "Bạn gọi index()");
		return "student/student-mgr";

	}
/*
	@RequestMapping(params = "btnInsert")
	public String insert(ModelMap modelmap,@RequestParam ("namesv") String namesv,
			@RequestParam ("mark") Double mark,@RequestParam ("major") String major
			) {
		
		modelmap.addAttribute("namesv",namesv);
		modelmap.addAttribute("mark",mark);
		modelmap.addAttribute("major",major);
		
		return "student/success";
	}
	*/
	@RequestMapping(params ="btnInsert" )
	public String insert(ModelMap modelMap,Student student) {
		
		modelMap.addAttribute("student",student);
		return "student/success2";
	}

	@RequestMapping(params = "btnUpdate")
	public String update(ModelMap modelMap) {
		modelMap.addAttribute("message", "Bạn gọi update()");
		return "student/update";
	}

	@RequestMapping(params = "btnDelete")
	public String delete(ModelMap modelMap) {
		modelMap.addAttribute("message", "Bạn chọn delete()");
		return "student/delete";

	}

	@RequestMapping(params = "btnReset")
	public String reset(ModelMap modelMap) {
		modelMap.addAttribute("message", "Bạn chọn reset()");
		return "student/reset";
	}
}
