public class Staff extends Person {

    private String school;
    private double pay;

    private Person person;

    Staff(String name, String address,String school,double pay,Person person) {
        super(name,address);
        this.school=school;
        this.pay=pay;
        this.person=person;
    }

    public void setSchool(String school){
        this.school=school;
    }

    public String getSchool(){
        return this.school;
    }

    public void setPay(double pay){
        this.pay=pay;
    }


    public double getPay(){
        return this.pay;
    }


    public void  display(){
        super.display();
        System.out.println("School: "+this.school);
        System.out.println("Pay: "+this.pay);
    }


    @Override
    public String toString() {
        return super.toString()
                + ", School: " +getSchool()
                + ", Pay: " +getPay();
    }
}
