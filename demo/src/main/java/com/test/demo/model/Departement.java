package com.test.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="department")
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;


    public String getName() {
        return name;
    }


    public long getId() {
        return id;
    }

    public Departement(String name) {
        this.name = name;
    }
    public Departement() {

    }
}
