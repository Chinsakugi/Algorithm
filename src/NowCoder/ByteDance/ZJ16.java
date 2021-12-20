package NowCoder.ByteDance;

import java.util.Scanner;

public class ZJ16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine();
            System.out.printf("%.2f\n",sum(n,m));
        }
    }

    public static double sum(int n, int m){
        double sum = 0;
        double x = n;
        for (int i=0;i<m;++i){
            sum+=x;
            x = Math.sqrt(x);
        }
        return  sum ;
    }
}
