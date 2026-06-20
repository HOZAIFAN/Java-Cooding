//creating abstarct class
abstract class Animal{
//    abstarct method contain nothing
    public  abstract void Awake ();
    public void sleep(){
        System.out.println("i sleep  baowww baowww");
    }
}
class Cow extends Animal{
//    writen abstract method
    public void Awake(){
        System.out.println("I talk Khaooo Khaaao");
    }
}
public class Abstraction {
    public static void  main(String[] args){
        Cow cow = new Cow();
        cow.sleep();
        cow.Awake();
    }
}
