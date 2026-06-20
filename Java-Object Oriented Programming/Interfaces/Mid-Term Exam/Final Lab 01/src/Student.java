public class Student extends Person {

    public String program;

    private int year;
    private double fee;
    private Person person;

    Student(int year, double fee,Person person,String program,String name, String address)

    {
        super(address,name);
        setFee(fee);
        setProgram(program);
        setYear(year);
        this.person=person;

    }

    public void setProgram(String program)
    {
        this.program = program;
    }

    public String getProgram() {
            return program;
    }


    public void setYear(int year)
    {
        this.year = year;
    }


    public int getYear()
    {
        return year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }


    public void display()
    {
        super.display();
        System.out.println("Program: " + getProgram());
        System.out.println("Year: " + getYear());
        System.out.println("Fee: " + getFee());

    }

    @Override
    public String toString() {
        return super.toString() + "\nProgram: " + getProgram() + "\nYear: " + getYear();

    }
}
