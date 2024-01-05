/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week14lab1;

/**
 *
 * @author USER
 */
public class Week14Lab1 {

    public static void main(String[] args) {
       
        Developer d1=new FreelanceDeveloper(1, "Ali", 5, 400);
         Developer d2=new SeniorDeveloper(2 ,"Mohanad", 10d);
          Developer d3=new RegularDeveloper(3, "husam ", 12d);
          
          Developer [] DevArray={d1,d2,d3};
          
          for(Developer e:DevArray)
              System.out.println(e.income());
        
    }
}
