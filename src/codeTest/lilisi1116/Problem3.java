package codeTest.lilisi1116;

public class Problem3 {
    public long minimum (int[] a) {
        long sum = 0L;
        for (int num : a)
            sum+=num;
        int l = 0, r = 0;
        long sumTemp = 0L;
        long min = Long.MAX_VALUE;
        while (l<=r&&r<a.length){
            while (r < a.length &&l<=r&&sumTemp<sum){
                sumTemp += a[r];
                sum-=a[r];
                r++;
                min = Math.min(Math.abs(sum - sumTemp),min);
            }
            sumTemp -= a[l];
            sum += a[l];
            min = Math.min(Math.abs(sum - sumTemp),min);
            l++;
        }
        return min;
    }

    public static void main(String[] args) {
        Problem3 problem3 = new Problem3();
        int[] arr = {7,5,3,6,4,2,1};
        System.out.println(problem3.minimum(arr));
    }
}
