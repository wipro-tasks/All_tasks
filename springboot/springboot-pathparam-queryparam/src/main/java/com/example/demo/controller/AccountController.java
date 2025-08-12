
package com.example.demo.controller;

import com.example.demo.model.Account;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountController {

    @GetMapping("/user/{id}/accounts")
    public List<Account> getAccounts(@PathVariable String id,
                                     @RequestParam String type,
                                     @RequestParam String status) {

        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(id, type, status));
        accounts.add(new Account(id, "savings", "inactive"));

        return accounts;
    }
}
