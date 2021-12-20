package mianShiJingDian;

import java.util.Arrays;

public class T01_03 {
    public String replaceSpaces(String S, int length) {
        char[] arr = S.toCharArray();
        int i = length - 1;
        int j = S.length() - 1;
        while (i>=0){
            if (arr[i]==' '){
                arr[j] = '0';
                arr[j-1] = '2';
                arr[j-2] = '%';
                j = j - 3;
                i--;
            }
            else
                arr[j--] = arr[i--];
        }

        return new String(arr,j+1, S.length()-1-j);
    }

    public static void main(String[] args) {
        T01_03 solution = new T01_03();
        System.out.println(solution.replaceSpaces("ds sdfs afs sdfa dfssf asdf             ",27));
    }
}
