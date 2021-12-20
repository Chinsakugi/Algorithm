package NowCoder.KuaiShou;

import java.util.Arrays;
import java.util.Scanner;

public class KS2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        int[] mid;
        String[] line = scanner.nextLine().split(" ");
        mid = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
        sumTree(0,mid.length-1,mid);
        for(int i = 0; i < mid.length; i++){
            System.out.print(mid[i]);
            if(i<mid.length-1){System.out.print(" ");}
        }
    }

    public static int sumTree(int l, int r, int[] midTree){
        if (l==r){
            int temp = midTree[l];
            midTree[l] = 0;
            return temp;
        }
        int mid = (r + l) / 2;
        int node = midTree[mid];
        midTree[mid] = sumTree(l,mid-1,midTree) + sumTree(mid+1,r,midTree);
        return  midTree[mid] + node;
    }
}
