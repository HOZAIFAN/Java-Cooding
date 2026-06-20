/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4lt3;

class Fraction{
    private int Num1;
    private int Num2;
    
    
    
    Fraction(){
        this.Num1 =0;
        this.Num2 =3;
        
    }
    
    Fraction(int Num1,int Num2){
        this.Num1 = Num1;
        if (Num2 != 0) {
            this.Num2  = Num2 ;
        } else {
            System.out.println("Denominator cannot be 0. Setting to 1 by default.");
            this.Num2  = 1;
        }
    }
    
    
    
    public void setNum1(int Num1) {
        this.Num1 =Num1 ;
    }
    
    public int getNum1(){
        return Num1;
    }    
    
    public void setNum2(int Num2) {
        this.Num2 =Num2 ;
    }
    
    public int getNum2(){
        return Num2;
    }   
    
    
    public void display(){
        System.out.println(Num1 +"/"+Num2);
        
    }
    
    public boolean equals(Fraction f){
        
        return this.Num1*f.Num2 == this.Num2*f.Num1;
    }
    
    
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           Fraction f1 =new Fraction(2,3);
           Fraction f2 =new Fraction(4,6);
           
           f1.display();
           f2.display();
           
           
           System.out.println(f1.equals(f2));
           
    }    
    
    }
    

