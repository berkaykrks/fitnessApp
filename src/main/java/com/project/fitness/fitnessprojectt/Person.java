/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.fitness.fitnessprojectt;

/**
 *
 * @author Emrecan
 */
public class Person {
    private String name;
    private String surname;
    private String phoneNumber;
    private String eMail;
    private Address address;
    private String secondaryNumber;
    
    private int age;
    private int password;
    
    public Person(String name, String surname, String phoneNumber, String eMail, int age,int password,Address address) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
        this.age = age;
        this.password=password;
        this.address=address;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getPassword(){
        return password;
    }
    public void setPassword(int password){
        this.password=password;
    }
    public Address getAddress(){
        return address;
    } 
    public void setAddress(Address address){
        this.address=address;
    }
    
}
