public class Main {
    static void main() {

        Employee e1 = new Employee("Ahmed", 123, 45222.35);
        Employee e2 = new Employee("Bob", 125, 45837);
        e1.display();
        e2.display();

        RegularEmployee R1 = new RegularEmployee("Ali", 345, 812673, "Management", 2);
        R1.display();


        ContractEmployee C1 =new ContractEmployee("assam",322,38328,5,"local");
        C1.display();


        R1.display();
        C1.display();







    }

}
