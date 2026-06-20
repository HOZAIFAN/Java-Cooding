/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.lab2activity1;

/**
 *
 * @author ATECH
 */
class Rectangle{
    int length,width;
    
         Rectangle(){
        System.out.println("Object has created");
        length =5;
        width =20;
    }
        
        Rectangle (int l,int w){
            
            length=l;
            width=w;
            
            
        
    }
    
    public int CalculateArea(){
        return(length*width);
 
        
    }
}
public class OopLab2activity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        Rectangle r1 =new Rectangle();
        
        System.out.println(r1.CalculateArea());
        
        
        Rectangle r2 =new Rectangle(3,5);
        System.out.println(r2.CalculateArea());
        
    }
    
}
