package DSA.Recursion;
public class ReverseANumberN {
    static int Reverse(int n, int exp) {
        if (n < 10) {
            return n;
        }
        return (n % 10) * (int) Math.pow(10, exp) + Reverse(n / 10, exp - 1);
    }
    public static void main(String[] args) {
        int num = 1234;
        int length = (int) Math.log10(num); // Calculate the number of digits - 1
        System.out.println(Reverse(num, length));
    }
}
