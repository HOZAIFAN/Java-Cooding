package Mypakage2_i;

public class Runclass2_i {
    public static void main(String[] args){
        //making object of outerclass
         OuterClass japi=new OuterClass();
         //making object by accesisng inner class and pritnting it
         OuterClass.InnerClass japi2=japi.new InnerClass();
         japi2.show();
    }
}
