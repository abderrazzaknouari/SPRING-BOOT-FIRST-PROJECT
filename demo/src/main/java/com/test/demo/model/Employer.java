package com.test.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.collection.spi.InitializerProducerBuilder;
import org.springframework.data.jpa.repository.EntityGraph;

import java.util.List;
@Entity
@Table(name ="employer")
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "departementId")
    private Departement departement;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    public User getUser() {
        return user;
    }

    public Employer(String name, Departement departement, User user) {
        this.name = name;
        this.departement = departement;
        this.user = user;
    }

    public Employer() {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Departement getDepartement() {
        return departement;
    }
}
