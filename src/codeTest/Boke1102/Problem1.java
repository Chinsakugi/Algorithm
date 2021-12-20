package codeTest.Boke1102;

import java.util.Arrays;

public class Problem1 {
    public int bulbSwitch (int n) {
        if (n==0)
            return 0;
        boolean[] light = new boolean[n+1];
        Arrays.fill(light,false);
        for (int i=0;i<n;++i){
            int k = i;
            while (k<n){
                light[k] = !light[k];
                k+=i+1;
            }
        }
        int sum = 0;
        light[0] =true;
        for (boolean flag : light)
            sum += flag?1:0;
        return sum;
    }
}
