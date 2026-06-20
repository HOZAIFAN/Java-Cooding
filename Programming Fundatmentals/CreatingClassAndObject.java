class Japi{
    String Name="M Hozaifa";
    int Age= 18;
    String Program="Computer Science";
    Double Cgpa=3.87;
    String University="Comsats Uiversity Islamabad";
}



public class CreatingClassAndObject {
    public static void main(String[] args) {
        Japi PersonalInfo=new Japi();
        //overriding value 
        PersonalInfo.Age=24;
    System.out.println(PersonalInfo.Age);
        
    }
    
}
