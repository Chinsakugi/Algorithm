package lanQiao;

import sun.misc.GC;

public class J11B {
    static int GCD(int a, int b){
        if(b==0)
            return a;
        return GCD(b,a%b);
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i =1;i<=2020;++i){
            for(int j=1;j<=2020;++j){
                if (GCD(i,j)==1)
                    ++sum;
            }
        }
        System.out.println(sum);
    }

}
