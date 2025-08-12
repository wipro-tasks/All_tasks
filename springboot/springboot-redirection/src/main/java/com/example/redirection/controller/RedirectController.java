
package com.example.redirection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class RedirectController {

    // Redirect from /example/test → /example/test2
    @GetMapping("/example/test")
    public RedirectView redirectToTest2() {
        return new RedirectView("/example/test2"); // 302 redirect
    }

    // Final destination after redirect
    @GetMapping("/example/test2")
    public String test2Page() {
        return "✅ Test 2 Page Reached Successfully!";
    }
}
