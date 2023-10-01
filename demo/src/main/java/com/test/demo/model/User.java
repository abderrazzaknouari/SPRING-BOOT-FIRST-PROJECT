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
    @Column(name = "password")
    private String password;
    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }



    public User( String email, String password) {
        this.email = email;
        this.password = password;
    }
    public User() {
    }



}
