/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacet2;

/**
 *
 * @author ATECH
 */

interface Payable {
    double getPaymentAmount();
}


class Invoice implements Payable {
    
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}


abstract class Employee implements Payable {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
}


class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

   
    public double getPaymentAmount() {
        return weeklySalary;
    }
}





public class InterfaceT2 {

   
    public static void main(String[] args) {
        
        
         Payable[] payables = new Payable[3];

        payables[0] = new Invoice("P001", "Laptop Charger", 3, 1500);
        payables[1] = new SalariedEmployee("Ali", "Khan", "123-45-6789", 22000);
        payables[2] = new Invoice("P002", "Mouse", 5, 500);

        System.out.println(" Payments Due ");
        for (Payable p : payables) {
            System.out.println("Payment Amount: " + p.getPaymentAmount());
        }
    }
    
}
