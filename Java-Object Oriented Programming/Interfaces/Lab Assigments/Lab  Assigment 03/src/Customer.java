public class Customer extends User{

    private String license_number;
    private String rental_history;

    public Customer(String user_id, String name, String email, String password, String license_number, String rental_history){
        super(user_id, name, email, password);
        this.license_number = license_number;
        this.rental_history = rental_history;
    }

    public String getLicense_number(){
        return license_number;
    }

    public void setLicense_number(String license_number){
        this.license_number = license_number;
    }

    public String getRental_history(){
        return rental_history;
    }

    public void setRental_history(String rental_history){
        this.rental_history = rental_history;
    }

    public void viewRental_history(){
        System.out.println("Rental history for " + getName() + ": " + rental_history);
    }


}
