public class ContractEmployee extends Employee {

    private int contractDuration;

    private String contractType;

    public ContractEmployee(String name, int employeeId ,double salary, int contractDuration, String contractType) {
        super(name, employeeId, salary);
        setContractDuration(contractDuration);
        setContractType(contractType);
    }


    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }
    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }
    public String getContractType() {
        return contractType;
    }

    public void display() {
        super.display();
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
    }
}
