package leetCode;
//4. 寻找两个正序数组的中位数

import java.util.Arrays;

public class Problem4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int left = (m+n+1)/2;
        int right = (m+n+2)/2;
        return (findK(nums1,0,nums2,0,left)+findK(nums1,0,nums2,0,right))/2.0;
    }

    public int findK(int[]num1, int i, int[]num2, int j,int k){
        if (i>=num1.length)
            return num2[j+k-1];
        if (j>=num2.length)
            return num1[i+k-1];
        if (k==1)
            return Math.min(num1[i],num2[j]);
        int mid1 = (i+k/2-1<num1.length)?num1[i+k/2-1]:Integer.MAX_VALUE;
        int mid2 = (j+k/2-1<num2.length)?num2[j+k/2-1]:Integer.MAX_VALUE;
        if (mid1<mid2)
            return findK(num1,i+k/2,num2,j,k-k/2);
        else
            return findK(num1,i,num2,j+k/2,k-k/2);
    }
}
