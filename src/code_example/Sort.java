package code_example;

import java.util.Arrays;

public class Sort {
    /*
    冒泡排序  O(n^2)
     */
    public int[] bubbleSort(int[] arr){
        int len = arr.length;
        for (int i=0;i<len-1;i++){
            for (int j=0;j<len-1-i;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        return arr;
    }

    //选择排序  O(n^2)
    public int[] sort(int[] sourceArray) throws Exception {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            // 每轮需要比较的次数 N-i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
        return arr;
    }

    //插入排序  O(n^2)
    public int[] insertionSort(int[] sourceArray) throws Exception {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i;
            while (j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            if (j != i) {
                arr[j] = tmp;
            }
        }
        return arr;
    }

    //希尔排序  O(nlogn)
    public  int[]  shellSort(int[] arr){
        if(arr == null || arr.length <= 1){
            return arr;
        }
        //希尔排序  升序
        for (int d = arr.length / 2;d>0;d /= 2){ //d：增量  7   3   1
            for (int i = d; i < arr.length; i++){
                //i:代表即将插入的元素角标，作为每一组比较数据的最后一个元素角标
                //j:代表与i同一组的数组元素角标
                for (int j = i-d; j>=0; j-=d){ //在此处-d 为了避免下面数组角标越界
                    if (arr[j] > arr[j + d]) {// j+d 代表即将插入的元素所在的角标
                        //符合条件，插入元素（交换位置）
                        int temp = arr[j];
                        arr[j] = arr[j + d];
                        arr[j + d] = temp;
                    }
                }
            }
        }
        return arr;
    }

    //归并排序  O(nlogn)
    public void merge(int[] arr,int low,int mid,int high,int[] tmp){
        int i = 0;
        int j = low,k = mid+1;  //左边序列和右边序列起始索引
        while(j <= mid && k <= high){
            if(arr[j] < arr[k]){
                tmp[i++] = arr[j++];
            }else{
                tmp[i++] = arr[k++];
            }
        }
        //若左边序列还有剩余，则将其全部拷贝进tmp[]中
        while(j <= mid){
            tmp[i++] = arr[j++];
        }

        while(k <= high){
            tmp[i++] = arr[k++];
        }

        for(int t=0;t<i;t++){
            arr[low+t] = tmp[t];
        }
    }

    public void mergeSort(int[] arr,int low,int high,int[] tmp){
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(arr,low,mid,tmp); //对左边序列进行归并排序
            mergeSort(arr,mid+1,high,tmp);  //对右边序列进行归并排序
            merge(arr,low,mid,high,tmp);    //合并两个有序序列
        }
    }

    //快速排序  O(nlogn) ~ O(n^2)
    public int[] quickSort(int[]arr, int left, int right){
        if (left<right){
            int partitionIndex = partition(arr,left,right);
            quickSort(arr,left,partitionIndex-1);
            quickSort(arr,partitionIndex+1,right);
        }
        return arr;
    }

    public int partition(int[]arr, int left, int right){
        int pivot = left;
        int index = pivot + 1;
        for (int i=index;i<=right;++i){
            if (arr[i]<arr[pivot]){
                swap(arr,i,index);
                index++;
            }
        }
        swap(arr,pivot,index-1);
        return index-1;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] nums = {5,3,1,4,6};
        Sort sort = new Sort();
        int[] temp =new int[5];
        //sort.mergeSort(nums,0,4,temp);
        System.out.println(Arrays.toString(sort.quickSort(nums,0,4)));
    }
}
