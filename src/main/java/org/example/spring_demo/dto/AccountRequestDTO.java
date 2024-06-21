package org.example.spring_demo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountRequestDTO {

    private String name;
    private String email;
    private Integer bill;

    public AccountRequestDTO (final String name,
                             final String email,
                             final Integer bill) {
        this.name = name;
        this.email = email;
        this.bill = bill;
    }

    public AccountRequestDTO() {
    }
}
