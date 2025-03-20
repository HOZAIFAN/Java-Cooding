public class Constructor2{
    int age;
    String Name;
  
    public Constructor2( int age , String Name) {
    String Myname=Name;
    int Myage=age;
  }
  public static void main(){
   Constructor2 japi=new Constructor2(18, "Muhammad Hozaifa Naeem");
   System.out.printf("Hello %s of age %d,what do like to take? cofee or Tea:",japi.Myname(),japi.Myage());
  }
}

