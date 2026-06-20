public class RegularEmployee extends Employee {
    private String department;
    private int yearOfService;


   public  RegularEmployee(String name,int employeeId,double salary ,String department,int yearOfService){
       super(name,employeeId,salary);
       setDepartment(department);
       setYearOfService(yearOfService);
   }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setYearOfService(int yearOfService) {
        this.yearOfService = yearOfService;
    }

    public int getYearOfService() {
        return yearOfService;
    }


    public void display() {
        super.display();
        System.out.println("Department: " + getDepartment());
        System.out.println("Year of Service: " + getYearOfService());

    }
}
