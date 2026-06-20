/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.lab.pkg2.task.pkg4;

class Marks {
    
    int maths ,phy, chem;
    
    Marks(){
        
        maths=99;
        phy =65;
        chem=75;
        
        
    }
    
    Marks(int m, int p ,int c){
        
        maths =m; 
        phy =p;
        chem=c;
    }
    
    
    void display(){
        
        System.out.println("MATHS = "+maths+"Phy ="+phy+"CHEM ="+chem);
    }
    
}

public class OopLab2Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Marks m1 =new Marks();
        m1.display();
        
        
        Marks m2 =new Marks(100,75,67);
        m2.display();
        
        
        
        Marks m3 =new Marks(363,45,123);
        m3.display();
        
        
        Marks m4=new Marks(89,76,45);
        m4.display();
        
        
    }
    
}
