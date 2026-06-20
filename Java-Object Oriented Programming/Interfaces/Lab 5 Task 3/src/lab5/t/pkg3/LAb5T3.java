/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5.t.pkg3;
import java.util.*;

/**
 *
 * @author ATECH
 */


class Point{
    int x_cord;
    int y_cord;
    
    Point(int x_cord,int y_cord){
        this.x_cord =x_cord;
        this.y_cord =y_cord;
    }
    
    public void setx_cord (int x_cord ){
        this.x_cord =x_cord ;
    }
    
    public int getx_cord (){
        return x_cord;
    }
    
    
    public void sety_cord (int y_cord ){
        this.y_cord =y_cord ;
    }
    
    public int gety_cord (){
        return y_cord;
    }
    
    public void display(){
        System.out.println("x_cord is"+x_cord+" and y_cord is "+y_cord);
    }
  
}


class Line{
    Point startPoint = new Point(2,3);
    Point endPoint = new Point(9,10);
    
    
    public double calculate_length(){
        double x1 =startPoint.getx_cord();
        double x2 =endPoint.getx_cord();
        
        double y1 = startPoint.gety_cord();
        double y2 = endPoint.gety_cord();
        
        
        return Math.sqrt((x2-x1)*2+(y2-y1)*2);
    }   
    
    
}
public class LAb5T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Line L1 =new Line();
       L1.calculate_length();
       
       
       System.out.println("length of L1 is  "+L1.calculate_length());
       
    }
    
}
