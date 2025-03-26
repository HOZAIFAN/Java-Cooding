package Mypakage2_i;

public class OuterClass {
    protected class InnerClass {
        public InnerClass() { // 🔄 Change from protected to public
            System.out.println("InnerClass constructor called!");
        }

        protected void show() {
            System.out.println("This is a statement from a protected class.");
        }
    }
}
