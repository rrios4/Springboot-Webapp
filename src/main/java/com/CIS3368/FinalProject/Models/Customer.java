package com.CIS3368.FinalProject.Models;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="customer_table")
public class Customer {
    @Id
    @Column(name="customerid")
    private String customerId;
    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;
    @Column(name="address")
    private String address;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="zipcode")
    private String zipcode;
    @Column(name="email")
    private String email;

/*    @OneToMany(targetEntity = Orders.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_customerid",referencedColumnName = "customerid")
    private List<Orders> orders;*/

    public Customer()
    {

    }

    public Customer(String customerId, String firstName, String lastName, String address, String city, String state,
                    String zipcode, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.email = email;

    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
