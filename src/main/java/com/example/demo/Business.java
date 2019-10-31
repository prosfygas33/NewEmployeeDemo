package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public final class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Business(){

    }

    public long getId() {
        return id;
    }

    
}
