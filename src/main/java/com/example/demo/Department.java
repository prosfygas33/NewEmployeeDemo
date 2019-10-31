package com.example.demo;


import javax.persistence.*;


@Entity
public final class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="description")
    private  String desc;


    public Department(){

    }

    public Department(String desc) {
        this.desc = desc;
    }

    public long getId() {
        return id;
    }


    public String getDesc() {
        return desc;
    }

}
