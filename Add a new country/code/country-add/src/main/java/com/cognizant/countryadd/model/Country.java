package com.cognizant.countryadd.model;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "co_code")
    private String code;

    @Column(name = "co_name")
    private String name;

    // Getters and setters

    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }

    // Constructors (default + parameterized)
}
