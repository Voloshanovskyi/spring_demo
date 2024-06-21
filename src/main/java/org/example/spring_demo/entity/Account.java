package org.example.spring_demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Account {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private Integer bill;

    public Account() {
    }

    public Account(final String name,
                   final String email,
                   final Integer bill) {
        this.name = name;
        this.email = email;
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id +
               ", name='" + name + '\'' +
               ", email='" + email + '\'' +
               ", bill=" + bill +
               '}';
    }
}
