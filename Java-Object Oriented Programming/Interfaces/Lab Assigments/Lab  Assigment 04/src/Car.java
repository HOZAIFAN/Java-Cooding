public class Car extends Vehicle{

    private int num_doors;

    public Car(String id, String brand, String model, int year, double price, boolean available, int num_doors) {
        super(id, brand, model, year, price, available);
        this.num_doors = num_doors;
    }

    public int getNum_doors(){
        return num_doors;
    }

    public void setNum_doors(int num_doors) {
        this.num_doors = num_doors;
    }
}
