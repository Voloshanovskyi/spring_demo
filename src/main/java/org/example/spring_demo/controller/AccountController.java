package org.example.spring_demo.controller;

import org.example.spring_demo.dto.AccountRequestDTO;
import org.example.spring_demo.dto.AccountResponseDTO;
import org.example.spring_demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    @GetMapping("/hello")
    public String helloSpring() {
        return "Hello Spring!";
    }

    @PostMapping("/accounts")
    public Long createAccount(@RequestBody AccountRequestDTO accountRequestDTO) {
        return accountService.createAccount(accountRequestDTO.getName(),
                accountRequestDTO.getEmail(),
                accountRequestDTO.getBill());
    }

    @GetMapping("/accounts/{id}")
public AccountResponseDTO getAccount(@PathVariable Long id){
        return new AccountResponseDTO(accountService.getAccountById(id));
    }
}
