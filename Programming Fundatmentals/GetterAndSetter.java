public class GetterAndSetter {
    public static void main(String[] args){
        class person {
            private String Name;
            private int Age;

            public  void setName(String name) {
                this.Name = name;
            }

            public String getName() {
                return Name;
            }
            public void setAge(int age){
                if(age>0 && age<20){
                this.Age=age;
                }
                else {
                    System.out.println("You are out of age");
                }
            }
            public int getAge(){
                return Age;
            }

        }
        person japi=new person();
        japi.setName("Hozaifa");
        japi.setAge(23);
        System.out.println(japi.Name);
        System.out.println(japi.Age);
    }
}
