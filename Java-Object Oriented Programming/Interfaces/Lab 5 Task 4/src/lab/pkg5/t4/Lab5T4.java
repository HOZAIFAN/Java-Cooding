/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg5.t4;

/**
 *
 * @author ATECH
 */
class Pizza{
    private String size;
    private int no_of_cheeze_topings;
    private int no_of_pepperoni_topings;
    private int no_of_ham_topings;
    
    
    
    Pizza(String size,int no_of_cheeze_topings,int no_of_pepperoni_topings,int no_of_ham_topings){
        
        this.size =size;
        this.no_of_cheeze_topings = no_of_cheeze_topings;
        this.no_of_pepperoni_topings = no_of_pepperoni_topings;
        this.no_of_ham_topings  = no_of_ham_topings;
        
    }
    
    public void setsize(String size){
        this.size =size;
    }
    
    public String getsize(){
        return size;
    }
    
    public void setno_of_cheeze_topings(int no_of_cheeze_topings){
        this.no_of_cheeze_topings = no_of_cheeze_topings;
    }
    
    public int getno_of_cheeze_topings(){
        return no_of_cheeze_topings;
    }
    
    public void setno_of_pepperoni_topings(int no_of_pepperoni_topings){
        this.no_of_pepperoni_topings = no_of_pepperoni_topings;
    }
    
    public int getno_of_pepperoni_topings(){
        return no_of_pepperoni_topings;
    }
    
    public void setno_of_ham_topings(int no_of_ham_topings){
        this.no_of_ham_topings = no_of_ham_topings;
    }
    
    public int getno_of_ham_topings(){
        return no_of_ham_topings;
    }
    
    public double calCost(){
        int totalToppings = no_of_cheeze_topings + no_of_pepperoni_topings + no_of_ham_topings;
        double  cost = 0;
        if(size == "small"){
            cost = 10 + (2 * totalToppings);
            
        }else if (size == "medium"){
            cost = 12 + (2 * totalToppings);
        }else if (size == "large"){
            cost = 14 + (2 * totalToppings);
        
         } else {
            System.out.println("invalid pizza size");
        }
        return cost;
             
}
    
    public String getDescription() {
        return "Pizza size: " + size.toUpperCase() +
                ", Cheese toppings: " + no_of_cheeze_topings +
                ", Pepperoni toppings: " +no_of_pepperoni_topings +
                ", Ham toppings: " +no_of_ham_topings ;
                
    }
    
} 

class PizzaOrder{
    Pizza pizza1;
    Pizza pizza2;
    Pizza pizza3;
    
    public void setpizza1(Pizza p1){
        this.pizza1 = p1;
    }
    
     public void setpizza2(Pizza p2){
        this.pizza2 = p2;
    }
      public void setpizza3(Pizza p3){
        this.pizza3 = p3;
    }
      
      public double calcTotal() {
        double total = 0;
        if (pizza1 != null) total += pizza1.calCost();
        if (pizza2 != null) total += pizza2.calCost();
        if (pizza3 != null) total += pizza3.calCost();
        return total;
      }
      
}
    
public class Lab5T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pizza p1 =new Pizza("large",1,1,2);
        p1.getDescription();
        
        System.out.println( p1.getDescription());
        System.out.println("total cost will be "+p1.calCost());
        
        
        Pizza P2 =new Pizza("small",3,2,4);
        System.out.println( P2.getDescription());
        System.out.println("total cost will be "+P2.calCost());
        
        
        PizzaOrder order1 = new PizzaOrder();
        order1.setpizza1(p1);
        order1.setpizza2(P2);
        
        System.out.println("\n==========================");
        System.out.println("Total order cost: $" + order1.calcTotal());
        
    }
    
}
