public class Person {

    private String name;
    private String address;

    Person(String name, String address) {
        setName(name);
        setAddress(address);

    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }


    public void display() {
        System.out.println(getName());
        System.out.println(getAddress());

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
