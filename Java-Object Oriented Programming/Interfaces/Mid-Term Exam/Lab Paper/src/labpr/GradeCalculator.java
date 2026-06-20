/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpr;

/**
 *
 * @author ATECH
 */
public class GradeCalculator {
    public void calculateGrade(Student s) {
        int m = s.getmarks();
        String grade;
        if (m >= 90)
            grade = "A+";
        else if (m >= 80)
            grade = "A";
        else if (m >= 70)
            grade = "B";
        else if (m >= 60)
            grade = "C";
        else
            grade = "Fail";

        System.out.println("Grade for " + s.getname() + ": " + grade);
    }

    
}
