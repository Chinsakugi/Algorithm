package lanQiao;

import java.util.Scanner;

public class J11F {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0, min = 100, sum = 0;
        int num = scan.nextInt();
        for(int i=0;i<num;++i){
            int j = scan.nextInt();
            if(j>max)
                max = j;
            if (j<min)
                min = j;
            sum += j;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println((double)Math.round((double) sum/num * 100)/100);
        scan.close();
    }
}
