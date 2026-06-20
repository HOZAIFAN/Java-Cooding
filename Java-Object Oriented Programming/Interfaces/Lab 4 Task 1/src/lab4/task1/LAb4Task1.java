/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4.task1;

/**
 *
 * @author ATECH
 */

class Marks{
    private int Maths;
    private int Physics;
    private int Chem;
    
public void setm1(int M){
this.Maths=M;

} 

public int getm1(){
    return Maths;
}

public void setm2(int P){
this.Physics=P;

} 

public int getm2(){
    return Physics;
}

public void setm3(int C){
this.Chem=C;

} 

public int getm3(){
    return Chem;
}


    
}


public class LAb4Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Marks m1 =new Marks();
        m1.setm1(55);
        m1.setm2(98);       
        m1.setm3(98);
        
        System.out.println("Marks of maths are  "+ m1.getm1() +" ,Physics are "+ m1.getm2()+" ,Chem are"+m1.getm3());
    }
    
}
