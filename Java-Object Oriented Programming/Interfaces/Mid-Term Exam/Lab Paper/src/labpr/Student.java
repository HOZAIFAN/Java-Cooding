/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpr;

/**
 *
 * @author ATECH
 */
public class Student extends Person {
    private String rollno;
    private int marks;

    Student (String name, int age,String rollno, int marks) {
        super(name, age);
        setrollno(rollno);
        setmarks(marks);

    }
    public void setrollno(String rollno) {
        this.rollno = rollno;
    }

    public String getrollno() {
        return rollno;
    }

    public void setmarks(int marks) {
        this.marks = marks;
    }

    public int getmarks() {
        return marks;
    }

    public void display(String rollno ,int marks) {
        super.display();
        System.out.println(rollno);
        System.out.println(marks);

    }

    public void copyData(Student s1) {
        setrollno(s1.getrollno());
        setmarks(s1.getmarks());
    }
    
}
