package leetCode;

import java.util.Arrays;

public class Problem121 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int min = prices[0];
        for (int i = 1; i < n; ++i) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min,prices[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Problem121 problem = new Problem121();
        int result = problem.maxProfit(prices);
        System.out.println(result);
    }
}
