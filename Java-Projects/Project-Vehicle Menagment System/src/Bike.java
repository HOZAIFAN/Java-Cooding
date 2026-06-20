public class Bike extends Vehicle{
    private boolean has_helmet;

    public Bike(String id, String brand, String model, int year, double price, boolean available, boolean has_helmet) {
        super(id, brand, model, year, price, available);
        this.has_helmet = has_helmet;
    }

    public void setHas_helmet(boolean has_helmet) {
        this.has_helmet = has_helmet;
    }

    public boolean getHas_helmet() {
        return has_helmet;
    }


}
