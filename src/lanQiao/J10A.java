package lanQiao;

import java.io.File;

public class J10A {
    static Boolean check(int n){
        while (n!=0){
            int x = n%10;
            if(x%2==0)
                return false;
            n=n/10;
        }
        return true;
    }
    public static void main(String[] args) {
        int x = 2019;
        Boolean flag = false;
        int i=1;
        while (!flag){
            if (check(x)){
                System.out.println(x);
                flag = true;
            }
            ++i;
            x = 2019 * i;
        }
    }
}
