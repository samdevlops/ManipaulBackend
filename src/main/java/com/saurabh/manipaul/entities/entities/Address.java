package com.saurabh.manipaul.entities.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Address {

    @Id
    private int add_id;

    private int pincode;

    private String firstLine;

    private String street;

    private String city;

    private String state;

    private String country;

    @OneToOne
    @JoinColumn(name = "id")
    private Hospital hospital;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Address(int add_id, int pincode, String firstLine, String street, String city, String state, String country) {
        this.add_id = add_id;
        this.pincode = pincode;
        this.firstLine = firstLine;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public Address() {
        super();
    }

    public int getAdd_id() {
        return add_id;
    }

    public void setAdd_id(int add_id) {
        this.add_id = add_id;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
