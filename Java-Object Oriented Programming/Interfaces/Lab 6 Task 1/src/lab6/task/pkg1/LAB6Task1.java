/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package lab6.task.pkg1;

class Person{
        String name;
        String address;
        String phone_number;
        String email ;
        
       public Person(String name,String address,String phone_number,String email ){
            this.name =name;
            this.address =address;
            this.phone_number = phone_number;
            this.email = email;
        }
        
        public void display(){
            System.out.println("name is"+name+ "address is"+address+ "phone_number is "+phone_number+"email is"+email);
        }
    }
    
    class Student extends Person{
        String status;
        
        
       Student(String n, String ad, String pn, String em, String s){
           super(n, ad, pn, em);
            this.status = s;
        }
       
       public void display(){
           super.display();
           System.out.println("Status " +status);
           
           
       }
        
    }
    
    class Employee extends Person{
        String office;
        String salary;
        
        
        public Employee(String name,String address,String phone_number,String email,String office,String salary ){
            super(name,address,phone_number,email);
            this.office = office;
            this.salary = salary;
           
            
        }
        
        public void display(){
            super.display();
            System.out.println("Office is " +office+"Salary is"+salary);
        }
        
    }
    
    class Faculty extends Employee{
        int office_hours;
        int rank;
        
        public Faculty(String name,String address,String phone_number,String email,String office,String salary,int office_hours,int rank){
            super(name, address, phone_number, email,office, salary);
            this.office_hours = office_hours;
            this.rank =rank;
        }
        public void display(){
            super.display();
            System.out.println("Office hours are"+office_hours+ "and rank is"+rank);
        }
        
    }
    
    class Staff extends Employee{
        String title;
        
        Staff(String name,String address,String phone_number,String email,String office,String salary,String title){
            super(name, address, phone_number, email,office, salary);
            this.title = title;
        }
        
        public void display(){
            super.display();
            System.out.println("Title is"+title);
        }
    }


public class LAB6Task1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        
        Staff S1 = new Staff("ahmed","Attock","03234232322","dijie@gmail.com","Techtrend", "344200.0", "Junior Developer");
                
        S1.display();
        
        
       
    }
    
}
