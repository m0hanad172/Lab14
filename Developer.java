/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week14lab1;

public abstract  class Developer {

String fullName ;
int id ;

abstract double income ();

    public Developer(String fullName, int id) {
        this.fullName = fullName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Developer{" + "fullName=" + fullName + ", id=" + id + '}';
    }
    
}

class RegularDeveloper extends Developer {
    double monthlySalary ;
    
    public RegularDeveloper(int id ,String fullName,double monthlysalary){
        super(fullName,id);
        this.monthlySalary=monthlysalary;
    }
    @Override
    double income (){
        
        return monthlySalary;
        
    } 
}

class SeniorDeveloper extends RegularDeveloper implements PromotionBehavior{
    
    public SeniorDeveloper(int id , String fullName ,double monthlySalary){
        super(id,fullName,monthlySalary);
    }
    @Override
    public double getPromotion(){
        return 1.5d*monthlySalary;
        
    }
    
    @Override
    double income(){
       return  monthlySalary+getPromotion();
    }
}

class FreelanceDeveloper extends Developer implements BonusSalaryBehaviour {
    int unitPrice ;
    int hours ;
    
    public FreelanceDeveloper(int id , String fullName , int hours,int unitPrice){
        super(fullName,id);
        this.hours=hours;
        this.unitPrice=unitPrice;
    }
    
    @Override
    public double income(){
        return hours*unitPrice+getBonusSalary();
    }
    @Override
    public double getBonusSalary(){
        return hours*1.5;
    }
}