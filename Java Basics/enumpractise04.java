import java.util.Scanner;

enum TrafficLights{
    RED("STOP"),YELLOW("READY"),GREEN("GO");
    private  String action;
    TrafficLights(String action){
        this.action=action;
    }
    public String getAction(){
        return action;
    }
}
public class enumpractise04 {
    public  static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a traffic light colour:");
        String colour=scanner.next().toUpperCase();
        try{
            TrafficLights Action;
            Action = TrafficLights.valueOf(colour);
            System.out.printf("Action: %s ",Action.getAction());
        }catch(IllegalArgumentException e){
            System.out.printf("Enter a correct Light colour:");

        }
    }

}
