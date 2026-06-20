/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l7t1;

/**
 *
 * @author ATECH
 */
public class Drama {
    public Drama(String mpaaRating, int idNumber, String title) {
        super(mpaaRating, idNumber, title);
    }

    
    public double calcLateFees(int daysLate) {
        return daysLate * 2.0;
    }
}
