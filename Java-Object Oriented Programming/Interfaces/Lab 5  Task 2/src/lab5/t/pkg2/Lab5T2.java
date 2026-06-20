/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5.t.pkg2;

/**
 *
 * @author ATECH
 */


class Address{
    String Street;
    int house_No;
    String city;
    int  code;
    
    
    Address(String Street,int house_No,String city,int  code){
        this.Street = Street;
        this.house_No =house_No;
        this.city = city;
        this.code =code;
    }
    
    public void setStreet(String Street){
        this.Street = Street;
    }
    
    public String getStreet(){
        return Street;
        
    }
    
    
    public void sethouse_No(int house_No){
        this.house_No =house_No ;
    }
    
    public int gethouse_No(){
        return house_No;
        
    }
    
    
    public void setcity(String city){
        this.city =city;
    }
    
    public String getcity(){
        return city ;
        
    }
    
    
    public void setcode(int code){
        this.code =code;
    }
    
    public int  getcode(){
        return  code;
        
    }
 
}



 class Person{
    private String Name;
    private Address address;
    
    
    Person(String Name,Address address){
        this.address =address;
        this.Name =Name;
    }
    
    public void setAddress(Address address){
        this.address =address;
        
    }
    public Address getAddress(){
        return address;
    }

    public void setName(String Name){
        this.Name =Name;
        
    }
    public String getName(){
        return Name;
    }    
    
    
    
}



public class Lab5T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
    }
    
}
