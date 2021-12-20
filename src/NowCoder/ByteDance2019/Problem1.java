package NowCoder.ByteDance2019;

import java.util.Scanner;

public class Problem1 {
    public String checkStr(String str){
        if (str==null|| str.equals(""))
            return str;
        int len = str.length();
        for (int i=0;i<len-2;++i){
            char c1 = str.charAt(i);
            char c2 = str.charAt(i+1);
            char c3 = str.charAt(i+2);
            if (c1==c2){
                if (c2==c3){
                    str =str.substring(0,i+1) + str.substring(i+2,len);
                    len--;
                    i--;
                }else if (i+3<len){
                    char c4 = str.charAt(i+3);
                    if (c3==c4){
                        str = str.substring(0,i+2)+str.substring(i+3,len);
                        len--;
                        i--;
                    }
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Problem1 problem1 = new Problem1();
        for (int i= 0;i<n;++i){
            String s = scanner.nextLine();
            System.out.println(problem1.checkStr(s));}

    }
}
