public class Methods{
    public void  japi(){
        System.out.println("This is accessed by creating object.");
    }
    static void Japi(){
        System.out.println("This is accesses without creating Object.");
    }
    
    public static void main(String[] args) {
        Methods info=new Methods();
        Japi();
        info.japi();
        // System.out.print(Japi());
      
        
    }
    
}
