package codeTest.Boke1102;

import java.util.HashMap;

public class Problem3 {

    HashMap<Character, Integer> map = new HashMap();

    public void init(){
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }
    public int romanToInt (String s) {
        init();
        int n = s.length();
        char[] str = s.toCharArray();
        int res = 0;
        int i = 0;
        for (;i<n-1;++i){
            char ch1 = str[i];
            char ch2 = str[i+1];
            if (map.get(ch1)>=map.get(ch2)){
                res+= map.get(ch1);
            }else {
                if (ch1=='I')
                    res += ch2=='V'?4 : 9;
                else if (ch1=='X')
                    res +=ch2=='L'?40 : 90;
                else
                    res+=ch2=='D'?400 : 900;
                i++;
            }
        }
        if (i<=n-1)
            res+=map.get(str[i]);
        return res;
    }

    public static void main(String[] args) {
        Problem3 problem3 = new Problem3();
        System.out.println(problem3.romanToInt("IV"));
    }
}
