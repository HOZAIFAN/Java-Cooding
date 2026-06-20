/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l7t1;

/**
 *
 * @author ATECH
 */
public class L7T1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Movie m1 = new Action("PG-13", 101, "Fast & Furious");
        Movie m2 = new Comedy("PG", 102, "The Mask");
        Movie m3 = new Drama("R", 103, "The Godfather");
        Movie m4 = new Drama("R", 101, "Duplicate ID Movie"); // Same ID as m1 for testing equals()

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println();

        System.out.println("Late fees for 4 days late:");
        System.out.println(m1.getTitle() + ": $" + m1.calcLateFees(4));
        System.out.println(m2.getTitle() + ": $" + m2.calcLateFees(4));
        System.out.println(m3.getTitle() + ": $" + m3.calcLateFees(4));
        System.out.println();

        System.out.println("Are m1 and m4 equal? " + m1.equals(m4));  // true because IDs are the same
        System.out.println("Are m2 and m3 equal? " + m2.equals(m3));  // false
    }
    }
    
}
