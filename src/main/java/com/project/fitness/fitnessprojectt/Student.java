/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.fitness.fitnessprojectt;
/**
 *
 * @author Emrecan
 */
public class Student extends Person{
    private double price;
    
    public Student(String name, String surname, String phoneNumber, String eMail,Address address, int age,int password, double price){
        super(name,surname,phoneNumber,eMail,age,password,address);
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    
}
