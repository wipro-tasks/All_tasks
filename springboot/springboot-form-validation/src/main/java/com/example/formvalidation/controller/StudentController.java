
package com.example.formvalidation.controller;

import com.example.formvalidation.model.Student;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/enroll")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("sections", Arrays.asList("Graduate", "Post Graduate", "Research"));
        model.addAttribute("countries", Arrays.asList("INDIA", "CANADA", "USA"));
        model.addAttribute("subjects", Arrays.asList("Physics", "Chemistry", "Life Science", "Political Science"));
        return "enrollment_form";
    }

    @PostMapping("/enroll")
    public String submitForm(@Valid @ModelAttribute("student") Student student,
                             BindingResult bindingResult,
                             Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("sections", Arrays.asList("Graduate", "Post Graduate", "Research"));
            model.addAttribute("countries", Arrays.asList("INDIA", "CANADA", "USA"));
            model.addAttribute("subjects", Arrays.asList("Physics", "Chemistry", "Life Science", "Political Science"));
            return "enrollment_form";
        }
        return "success";
    }
}
