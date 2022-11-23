package com.thymeleaf.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thymeleaf.bean.Student;

@Controller
public class UtilityController {
	
	@RequestMapping("/demo/utilities")
	public String utilities(Model model) throws Exception {
		File file = new ClassPathResource("static/students.json").getFile();
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<List<Student>> type = new TypeReference<List<Student>>() {};
		List<Student> list = mapper.readValue(file, type);


		model.addAttribute("dssv", list);
		model.addAttribute("now", new Date());
		return "utilities";
	}
}
