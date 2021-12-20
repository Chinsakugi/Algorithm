package NowCoder.Alibaba2021;


import java.util.Scanner;

public class Problem1 {
    public static void quickSort(int[]arr, int[]arr2,int left, int right){
        if (left<right){
            int partitionIndex = partition(arr,arr2,left,right);
            quickSort(arr,arr2,left,partitionIndex-1);
            quickSort(arr,arr2,partitionIndex+1,right);
        }
    }

    public static int partition(int[] arr, int[] arr2, int left, int right){
        int pivot = left;
        int index = pivot + 1;
        for (int i=index;i<=right;++i){
            if (arr[i]<arr[pivot]){
                swap(arr,i,index);
                swap(arr2,i,index);
                index++;
            }
        }
        swap(arr,pivot,index-1);
        swap(arr2,pivot,index-1);
        return index-1;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int longestSubArray(int[] nums)
    {
        //tails[k] 的值代表长度为k+1子序列 的尾部元素值
        int[] tails = new int[nums.length];
        // res 为 tails当前长度
        int res = 0;
        for (int num:nums)
        {
            int l = 0;
            //r为数组的长度，而不是length-1，这点要注意
            int r = res;
            while(l < r)
            {
                int m = l + (r - l)/2;
                if(tails[m] < num)
                    l = m + 1;
                else
                    r = m;
            }
            tails[l] = num;
            if(r == res)
                res++;
        }
        return  res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i=0;i<t;++i){
            int n = scanner.nextInt();

            int[] x = new int[n];
            int[] y = new int[n];
            for (int j=0;j<n;++j)
                x[j] = scanner.nextInt();

            for (int j=0;j<n;++j)
                y[j] = scanner.nextInt();

            quickSort(x,y,0,n-1);
            int res = longestSubArray(y);
            System.out.println(res);
        }
    }
}
