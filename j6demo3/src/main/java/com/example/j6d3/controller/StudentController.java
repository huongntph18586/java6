package com.example.j6d3.controller;

import com.example.j6d3.bean.Student2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    @RequestMapping("/student/form")
    public String form(Model model) {
        Student2 student = new Student2();
        student.setFullName("Nguyễn Hương");
        student.setCountry("VN");
        student.setGender(true);
        model.addAttribute("sv",student);

        return  "student/form";
    }

    @PostMapping("/student/save")
    public String save(
            Model model,
            @Validated @ModelAttribute("sv") Student2 form,
            Errors errors
    ) {
        if (errors.hasErrors()) {
            model.addAttribute("message", "Vui lòng sửa cacs lồi sau");
            return "student/form";
        }
        return "student/success";
    }
}
