package NowCoder.algorithm;

public class NC140 {
    public int[] MySort (int[] arr) {
        quickSort(0,arr.length-1,arr);
        return arr;
    }

    public void quickSort(int left, int right, int[] arr){
        if (left<right){
            int index = partition(left,right,arr);
            quickSort(left,index-1,arr);
            quickSort(index+1,right,arr);
        }
    }

    public int partition(int left, int right, int[] arr){
        int pivot = left;
        int index = pivot + 1;
        for (int i=index;i<=right;++i){
            if (arr[i]<arr[pivot]){
                swap(i,index,arr);
                index++;
            }
        }
        swap(pivot,index-1,arr);
        return index-1;
    }

    public void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
