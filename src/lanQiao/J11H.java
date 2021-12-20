package lanQiao;

import java.util.Scanner;

public class J11H {
    static int f(String s, int x, int y){
        int[] word = new int[26];
        for (int i=x;i<=y;++i){
            word[s.charAt(i)-'a']++;
        }
        int result = 0;
        for(int i=0;i<26;++i){
            if(word[i]==1)
                result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s= scan.next();
        int result = 0;
        for (int i=0;i<s.length();++i){
            for (int j = i;j<s.length();++j)
                result += f(s,i,j);
        }
        System.out.println(result);
        scan.close();
    }
}
