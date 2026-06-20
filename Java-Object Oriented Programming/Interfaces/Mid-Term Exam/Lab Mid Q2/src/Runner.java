class Runner{
    static void main() {


        Circle c1 =new Circle(344);
        Circle c2 =new Circle(34.2);


        Cylinder CL = new Cylinder(c1,23);
        Cylinder CL2 = new Cylinder(c2,32);

        CL.displayVolume();
        CL2.displayVolume();
    }
}


