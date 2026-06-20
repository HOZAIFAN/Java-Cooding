enum Planet{
    EARTH(12742),MARS(6779),JUPITER(139820);
    private int diameter;
    Planet(int diameter){
        this.diameter=diameter;
    }
    public int getDiameter(){
        return diameter;
    }
}
 class enumPracrtise {
    public static void main(String[] args){
        Planet myplanet=Planet.EARTH;
        System.out.printf("My Planet is %s and of diameter %d.",myplanet,myplanet.getDiameter());
    }
}
