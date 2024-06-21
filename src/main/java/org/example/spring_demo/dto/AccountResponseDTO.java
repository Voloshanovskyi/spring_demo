package org.example.spring_demo.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.spring_demo.entity.Account;

@Setter
@Getter
public class AccountResponseDTO {
    private Long accountId;
    private String name;
    private String email;
    private Integer bill;

    public AccountResponseDTO(final Long accountId,
                              final String name,
                              final String email,
                              final Integer bill) {
        this.accountId = accountId;
        this.name = name;
        this.email = email;
        this.bill = bill;
    }

    public AccountResponseDTO(Account account) {
        accountId = account.getId();
        name = account.getName();
        email = account.getEmail();
        bill = account.getBill();
    }
}
