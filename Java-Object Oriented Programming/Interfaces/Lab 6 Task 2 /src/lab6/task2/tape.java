/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6.task2;

/**
 *
 * @author ATECH
 */
public class tape extends publications {
    
    private int PTinmin;
    
    tape(String title,int price,int PTinmin){
        super(title, price);
        this.PTinmin = PTinmin;
    }
    
    public void setPTinmin(int PTinmin ){
        this.PTinmin =PTinmin;
    }
    
    
    public int PTinmin (){
        return PTinmin;
    }
    
    public void display(){
        super.display();
        this.PTinmin = PTinmin;
    }
    
}
