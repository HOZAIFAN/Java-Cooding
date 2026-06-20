public class Student {

    private String name;
    private int [] result_array =new int [5];

    public Student(String name, int[] result_array) {
        this.name = name;
        for (int i = 0; i < 5; i++) {
            this.result_array[i] = result_array[i];
        }
    }

    public double Average() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += result_array[i];
        }
        return sum / 5.0;
    }
    public String getName() {
        return name;
    }
}
