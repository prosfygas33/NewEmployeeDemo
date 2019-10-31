package com.example.demo;


import javax.persistence.*;


@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;



    public Department(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
