package lanQiao;

public class moniB {

    public static void main(String[] args) {
        long[] arr = new long[20190324];
        arr[0]=1;
        arr[1]=1;
        arr[2]=1;
        for (int i=3;i<20190324;++i){
            arr[i] = (arr[i-1] + arr[i-2] + arr[i-3])%10000;
        }
        System.out.println(arr[20190323]);
    }
}
