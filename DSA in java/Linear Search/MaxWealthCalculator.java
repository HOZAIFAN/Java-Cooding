public class MaxWealthCalculator {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {7, 1, 5}
        };

        int maxWealth = maximumWealth(accounts);
        System.out.println("Maximum Wealth: " + maxWealth);
    }

    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int[] person : accounts) {
            int sum = 0;
            for (int money : person) {
                sum += money;
            }
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
