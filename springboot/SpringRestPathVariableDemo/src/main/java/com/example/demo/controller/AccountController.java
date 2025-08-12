package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class AccountController {

    @GetMapping("/{id}/accounts")
    public List<String> getAccounts(
            @PathVariable String id,
            @RequestParam String type,
            @RequestParam String status) {

        return List.of(
                "Account Info for User ID: " + id,
                "Type: " + type,
                "Status: " + status
        );
    }
}
