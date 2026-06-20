/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacet1;

/**
 *
 * @author ATECH
 */

 interface Shape {
    double getArea();
}

 class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing getArea()
    public double getArea() {
        return Math.PI * radius * radius;
    }
}


 class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing getArea()
    public double getArea() {
        return length * width;
    }
}

public class InterfaceT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Shape c = new Circle(5);       // radius 5
        Shape r = new Rectangle(4, 6); // length 4, width 6

        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Rectangle Area: " + r.getArea());
    }
    
}
