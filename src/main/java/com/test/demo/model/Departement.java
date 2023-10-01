package com.test.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name ="department")
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;

    public Departement(long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Departement() {

    }
}
