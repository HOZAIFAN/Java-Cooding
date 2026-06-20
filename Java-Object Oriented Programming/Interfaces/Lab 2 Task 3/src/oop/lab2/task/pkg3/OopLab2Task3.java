/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.lab2.task.pkg3;

/**
 *
 * @author ATECH
 */

class Distance{
     
    int feet,inches;
    
    Distance (){
        feet = 40;
        inches =200;
        
    }
    
    Distance(int f,int i){
        
        feet =f ;
        inches=i;
    }
    
    public void display(){
        
        System.out.println("The length is "+feet+ "and"+inches);
        
    }
    
    
    
    
}

public class OopLab2Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Distance d1=new Distance();
        d1.display();
        
        Distance d2 =new Distance (10 ,5);
        
        d2.display();
        
    }
    
}
