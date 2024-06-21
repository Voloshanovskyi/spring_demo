package org.example.spring_demo.service;

import org.example.spring_demo.entity.Account;
import org.example.spring_demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Long createAccount(String name, String email, Integer bill){
        Account account = new Account(name, email, bill);
        return accountRepository.save(account).getId();
    }
}
