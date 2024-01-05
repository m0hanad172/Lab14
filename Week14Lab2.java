/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week14lab2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class circule {
    public   final static double IP =3.14d;
    double radius ;
    String color ;
    
    public circule(double radius , String color ){
        this.radius=radius;
        this.color=color ;
        
    }
    
    public double getArea (){
        return radius*radius*IP;
    }

    @Override
    public String toString() {
        return "circule{" + "radius=" + radius +" "+",Area="+getArea()+ ", color=" + color + '}';
    }
    
    
}


class AreaComp implements Comparator <circule>{
        
        @Override
        public int compare(circule c1,circule c2){
            
            return (int)(c1.getArea()-c2.getArea());
        }
    }
public class Week14Lab2 {

    public static void main(String[] args) {
        
        circule c1=new circule(2, "red");
        circule c2=new circule(3, "blue ");
        circule c3=new circule(4, "yellow");
        List <circule> list=new LinkedList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        
        Collections.sort(list,new AreaComp());
        
        ListIterator iter =list.listIterator();
        
        while(iter.hasNext())
            System.out.println(iter.next());
        
        
    }
}
