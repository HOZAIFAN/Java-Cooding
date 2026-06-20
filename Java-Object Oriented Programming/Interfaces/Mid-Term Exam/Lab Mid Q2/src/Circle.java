public class Circle {
    private double radius;
    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

public void display(){
    System.out.println("The radius of the circle is: " + radius);
}
}
