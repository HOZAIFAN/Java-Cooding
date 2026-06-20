/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4lt1;



   class Distance{
       private int feet;
       private int inches;
       
       Distance(){
           feet =23;
           inches=10;
       }
       
       
       Distance(int feet,int inches){
           this.feet =feet;
           this.inches =inches;
           
       }
       
       public void setfeet(int feet){
           this.feet =feet;
       }
       
       public int getfeet(){
           return feet;
       }
       
       public void setinches(int inches){
           this.inches =inches;
       }
       
       public int getinches(){
           return inches;
         
       }
       
       public Distance addDistance(Distance d,Distance d1,Distance d2){
           Distance d_new = new Distance(d.feet+d1.feet+d2.feet ,d1.inches+d2.inches+d.inches);
           return d_new;
       }
       
       public String toString() {
        return feet + " feet " + inches + " inches";
    }
       
   }
public class Main {


    public static void main(String[] args) {
        Distance d =new Distance();
        Distance d1 =new Distance(22, 13);
        Distance d2 =new Distance(13,15);
        
        Distance sum =  d.addDistance(d,d1, d2);
        
        
        System.out.println(sum);
        
    }
    
}
