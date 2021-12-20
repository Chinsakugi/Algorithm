package codeTest.lilisi1116;

import java.util.Arrays;

public class Problem2 {
    public long ans (int[] array, int k) {
        long res = 0L;
        Arrays.sort(array);
        for (int i = 0;i<array.length-1;++i){
            int num = array[i];
            int temp = binarySearch(array,i+1,k-num);
            if (i<= array.length-2)
                res += (long)(temp - i);
            else
                res += (array[i]+array[i+1]<=k)?1:0;
        }
        return res;
    }

    public int binarySearch(int[] arr, int left, int k){
        int l = left;
        int r = arr.length-1;
        if (l==r)
            return 0;
        while (l<r){
            int mid = l + (r - l) / 2;
            if (arr[mid]<=k)
                l = mid+1;
            else
                r = mid;
        }
        return l;
    }

    public static void main(String[] args) {
        Problem2 problem2 = new Problem2();
        int[] nums = {1,2,1};
        //System.out.println(problem2.binarySearch(nums,1,5));
        System.out.println(problem2.ans(nums,2));
    }
}
