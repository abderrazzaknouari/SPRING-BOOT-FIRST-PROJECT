package com.test.demo.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name ="employer")
public class Employer {
    public Employer( String name) {
        this.name = name;
    }
    public Employer() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;



}
