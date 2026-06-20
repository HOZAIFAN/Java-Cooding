/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.assig.q1;

/**
 *
 * @author ATECH
 */


class HotdogStand {
   private int ID_number;
   private int No_of_dogs_sold;
   
   public HotdogStand(int id,int dogssold){
       
       this.ID_number=id;
       this.No_of_dogs_sold= dogssold;
   }
   
   public void justSold(){
       
       No_of_dogs_sold++;
   }
   
   public int getId() {
        return ID_number;
        
    }
   
   public int getNo_of_dogs_sold(){
       return  No_of_dogs_sold;
   }
}
public class LabAssigQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HotdogStand stand1 = new HotdogStand(1, 0);
        HotdogStand stand2 = new HotdogStand(2, 5);
        HotdogStand stand3 = new HotdogStand(3, 10);
        
        stand1.justSold();
        stand1.justSold();
        stand2.justSold();
        stand2.justSold();
                stand2.justSold();

        
        stand3.justSold();
        stand3.justSold();
        
        System.out.println("Stand " + stand1.getId() + " has sold " + stand1.getNo_of_dogs_sold() + " hotdogs today.");
        System.out.println("Stand " + stand2.getId() + " has sold " + stand2.getNo_of_dogs_sold() + " hotdogs today.");
        System.out.println("Stand " + stand3.getId() + " has sold " + stand3.getNo_of_dogs_sold() + " hotdogs today.");
        
    }
    
}
