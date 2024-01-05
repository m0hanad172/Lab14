/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week14lab3;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Book implements Comparable<Book>{
    String name ;
    double price ;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public double totalPrice(){
        return price+0.08*price;
    }
    @Override
    public int compareTo(Book b1){
        return (int)(this.totalPrice()-b1.totalPrice());
    } 

    @Override
    public String toString() {
        return "Book{" + "name=" + name +" "+", totalPrice="+totalPrice()+ ", price=" + price + '}';
    }
    
    
}
public class Week14Lab3 {

    public static void main(String[] args) {
       
        Book b1 =new Book("chemistry",500d);
        Book b2 =new Book("English",150d);
        Book b3 =new Book("physics",200d);
        Book b4 =new Book("Math",300d);
        
        List <Book> books = new LinkedList<>();
        
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        
        Collections.sort(books);
        
        Iterator iter=books.iterator();
        
        while(iter.hasNext())
            System.out.println(iter.next());
        
        
        
    }
}
