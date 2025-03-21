import java.util.Scanner;

enum Grades {
    A(90, 100), B(80, 90), C(70, 80), D(60, 70);
    private int MIn;
    private int Max;

    Grades(int MIn, int Max) {
        this.MIn = MIn;
        this.Max = Max;
    }

    public String getmyRange() {
        return MIn + " % - " + Max + "%";
    }
}
public class enumpractise02 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter the number \"Grades\"  of which range is to be check:");
        String grade=scanner.next().toUpperCase();
        try {
            Grades mygrades = Grades.valueOf(grade);
            System.out.printf("The maximum and minum range of \"GRADE\" %s is :%s", grade,mygrades.getmyRange());
        }catch (IllegalArgumentException e) {
            System.out.println("Invalid grade entered. Please enter A, B, C, D, or F.");
        }

    }
}
