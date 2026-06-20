
 class Cylinder extends Circle {
    private Circle circle;
    private double height;

    Cylinder(Circle circle, double height) {
        this.circle = circle;
        setHeight(height);

        calculateVolume();

    }

    public Circle getCircle() {
        return circle;
    }
    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume() {
        return 3.14* circle.getRadius()*2*height;

    }


    public void displayVolume() {
        circle.display();
        System.out.println("The volume of the cylinder is: " + calculateVolume());

    }

}






