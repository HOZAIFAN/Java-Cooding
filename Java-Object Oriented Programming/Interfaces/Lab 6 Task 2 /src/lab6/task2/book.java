/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6.task2;

/**
 *
 * @author ATECH
 */
public class book extends publications {
    
    int pagecount;
    
    book(String title,int price,int pagecount){
        super(title,price);
        this.pagecount =pagecount;
        
    }
    
    public void setpagecount(int pagecount){
        this.pagecount =pagecount;
    }
    
    
    public int getpagecount(){
        return pagecount;
        
        
    }
    
    public void display(){
        super.display();
        System.out.println("Page count is  "+pagecount);
        
    }
      
}
