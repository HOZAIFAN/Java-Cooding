public class Employee {
    private String name;
    private int employeeId;

    private double salary;
    public Employee(String name, int employeeId, double salary) {
        setEmployeeId(employeeId);
        setName(name);
        setSalary(salary);

        display();

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

     public void display() {
         System.out.println("Employee Name: " + getName());
         System.out.println("Employee ID: " + getEmployeeId());
         System.out.println("Employee Salary: " + getSalary());
     }

}
