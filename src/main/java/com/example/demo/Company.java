package com.example.demo;

import javax.persistence.*;

@Entity
public final class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    @Column(name="Name")
    private String name;


    public Company(){

    }

    public Company(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Company(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
