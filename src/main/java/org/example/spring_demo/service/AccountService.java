package org.example.spring_demo.service;


import org.example.spring_demo.entity.Account;
import org.example.spring_demo.exeption.AccountNotFoundException;
import org.example.spring_demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final AccountService2 accountService2;

    @Autowired
    public AccountService(AccountRepository accountRepository, final AccountService2 accountService2) {
        this.accountRepository = accountRepository;
        this.accountService2 = accountService2;
    }

    @Transactional
    public Long createAccount(String name, String email, Integer bill) {
        Account account = new Account(name, email, bill);
        Account account1 = accountRepository.save(account);
        accountService2.saveAccount2();
        int a = 1 / 0;
        Account account2 = new Account("Account2", "dingo@gmail.com", 1000);
        accountRepository.save(account2);
        return account1.getId();
    }

    public Account getAccountById(Long id) {
        return accountRepository.findById(id)
                .orElseThrow(() -> new AccountNotFoundException("Can't find account with id: " + id));
    }

    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    public Account deleteById(Long id) {
        Account account = getAccountById(id);
        accountRepository.deleteById(id);
        return account;
    }
}
