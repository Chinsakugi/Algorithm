package tencent_top_50;

import java.util.Arrays;

public class T215 {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return quick_find(nums,0,n-1,k);

    }

    public int quick_find(int[] nums, int left, int right, int k){
        int index = partition(nums,left,right);
        if (index - left ==k-1)
            return nums[index];
        else if (index-left > k - 1)
            return quick_find(nums,left,index-1,k);
        else
            return quick_find(nums,index+1,right,k-index-1 + left);
    }

    public int partition(int[] nums, int l, int r){
        int pivot = r;
        int index = pivot - 1;
        for (int i=index;i>=l;--i){
            if (nums[i]<nums[pivot]){
                swap(nums,i,index);
                index--;
            }
        }
        swap(nums,pivot,index+1);
        return index+1;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        T215 solution = new T215();
        int nums[] = {3,2,1,5,6,4};
        System.out.println(solution.findKthLargest(nums,6));
    }
}
