/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpr;

/**
 *
 * @author ATECH
 */
public class Person {
    private String name;
private int age;

Person(String name, int age) {
    setname(name);
    setage(age);

}

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
    return name;
    }

    public void setage(int age) {
        this.age = age;
    }

    public int getage() {
        return age;
    }

    public void display() {
    System.out.println("Name: " + getname());
        System.out.println("Age: " + getage());
    }
}
