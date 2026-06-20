/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.lab.pkg2.task5;

/**
 *
 * @author ATECH
 */

class Time{
    
    int hours ;
    int minutes;
    int seconds;
    
    Time(){
        
        hours =10;
        minutes =54;
        seconds =14;
    }
    
    Time (int h, int m,int s){
        
        hours =h;
        minutes=m;
        seconds=s;
        
        
        
    }
    
    public void display(){
        
       System.out.println("HOurs ="+hours+"minutes ="+minutes+ "seconds ="+seconds );
    }
    
}
public class OopLab2Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Time t =new Time();
        t.display();
        
        
        Time t1 =new Time(12,43,10);
        t1.display();
        
        
        
        
    }
    
}
