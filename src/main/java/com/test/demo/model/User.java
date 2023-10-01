package com.test.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name ="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id ;
    @Column(name = "email")
    private String email;

    public User(long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
    public User() {
    }

    @Column(name = "password")
    private String password;

}
