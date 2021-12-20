package lanQiao;

import java.math.BigInteger;

public class qipan {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("1");
        BigInteger sum = new BigInteger("0");
        int i = 0;
        while(i<64){
            sum = sum.add(num);
            num = num.multiply(new BigInteger("2"));
            ++i;
        }
        System.out.println(sum);
    }
}
