/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.fitness.fitnessprojectt;
/**
 *
 * @author Emrecan
 */
public class Antrenor extends Person{
    
    private double salary;
    private String major;
    
    public Antrenor(String name,String surname, String phoneNumber,String eMail,Address address,int age,double salary,String major,int password){
        super(name,surname,phoneNumber,eMail,age,password,address);
        this.salary=salary;
        this.major=major;
    }
    
    public Double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major=major;
    }
}
