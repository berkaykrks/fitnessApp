/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.fitness.fitnessprojectt;
/**
 *
 * @author Emrecan
 */
public class Admin extends Person{
    private int yearsOfExperience;
    
    public Admin(String name, String surname, String phoneNumber, String eMail, int age,int password,Address address,int yearsOfExperience){
        super(name,surname,phoneNumber,eMail,age,password,address);
        this.yearsOfExperience=yearsOfExperience;
    }
    public int getYearsOfExperience(){
        return yearsOfExperience;
    }
    public void setYearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience=yearsOfExperience;
    }
}
