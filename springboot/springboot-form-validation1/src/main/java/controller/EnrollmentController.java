package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import model.Student;

@Controller
public class EnrollmentController {

    @GetMapping("/enroll")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "enrollmentForm";
    }

    @PostMapping("/enroll")
    public String submitForm(@ModelAttribute("student") @Valid Student student,
                             BindingResult bindingResult,
                             Model model) {
        if (bindingResult.hasErrors()) {
            return "enrollmentForm";
        }
        // handle successful registration (e.g., save student)
        return "success";
    }
}
