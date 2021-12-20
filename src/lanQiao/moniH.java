package lanQiao;

import java.util.HashMap;
import java.util.Scanner;

public class moniH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        HashMap<Integer, Integer> map = new HashMap();
        for (int i=0;i<n;++i){
            a[i] = scanner.nextInt();
            while (map.containsKey(a[i])){
                a[i]+=1;
            }
            map.put(a[i],1);
        }

        for (int i=0;i<n;++i){
            System.out.print(a[i]+" ");
        }
    }
}
