package tencent_top_50;

public class T122 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int l = 0, r = 0;
        int res = 0;
        while (r<n-1){
            if (prices[r+1] < prices[r]) {
                res += prices[r] - prices[l];
                l = r + 1;
            }
            r++;
        }
        if (r > l)
            res += prices[r] - prices[l];
        return res;
    }

    public static void main(String[] args) {
        T122 solution = new T122();
        int arr[] = {7,1,5,3,6,4};
        System.out.println(solution.maxProfit(arr));
    }
}
