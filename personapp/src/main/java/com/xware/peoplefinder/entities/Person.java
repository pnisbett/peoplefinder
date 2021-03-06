package com.xware.peoplefinder.entities;

/**
 * Created by paul on 1/2/17.
 */

public class Person extends Contact{
    public Long id;
    public String firstname="";
    public String lastname="";
    public String address="";
    public String phone="";
    public String email="";
    public boolean checked;
    public Integer intId;
    public Person(){};
    public Person(long id, String content, String details) {
        this.id = id;
        this.firstname = content;
        this.lastname = details;
    }
    public Person(Long id, String first, String last, String address,String email,String phone) {
        this.id = id;
        this.firstname = first;
        this.lastname = last;
        this.address= address;
        this.email =email;
        this.phone=phone;

    }
    public Person(Long id, String first, String last, String address,String email,String phone,int intId) {
        this.id = id;
        this.firstname = first;
        this.lastname = last;
        this.address= address;
        this.email =email;
        this.phone=phone;
        this.intId=intId;

    }

    @Override
    public String toString() {
        return id + " " + firstname + " " + lastname;
    }
}