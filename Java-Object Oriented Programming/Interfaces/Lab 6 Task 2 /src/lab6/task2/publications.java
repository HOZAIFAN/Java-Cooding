/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6.task2;

/**
 *
 * @author ATECH
 */
public class publications {
    String title;
    int price;
    
    publications(String title,int price){
        this.title =title;
        this.price =price;
    }
    
    public void settitle(String title){
        this.title =title;
    }
    
    public String getitle(){
        return title;
    }
    
    public void setprice(int price){
        this.price =price;
    }
    
    public int getprice(){
        return price;
    }
    
    
    public void display(){
        System.out.println("The title is "+title);
        
        System.out.println("The price is "+price);
        
    }
}
