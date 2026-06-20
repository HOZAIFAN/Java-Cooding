/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labpr;

/**
 *
 * @author ATECH
 */
public class Labpr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Student s1 =new Student("Ali",17,"fa23bcs002",45);
    Student s2 =new Student("ammad",18,"fa23bcs004",49);

    GradeCalculator gc = new GradeCalculator();
    gc.calculateGrade(s1);
    
    gc.calculateGrade(s2);
    
    s1.display();
    s2.display();
       
    }
    
}
