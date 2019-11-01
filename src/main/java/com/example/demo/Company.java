package com.example.demo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public final class Company implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Column(name="Name")
    private String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
