package org.example.spring_demo.service;

import org.example.spring_demo.entity.Account;
import org.example.spring_demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService2 {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountService2(final AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void saveAccount2() {
        Account account3 = new Account("Martin", "dingoMartin@gmail.com", 3000);
        accountRepository.save(account3);
    }
}
