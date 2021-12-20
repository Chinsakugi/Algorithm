package LeetcodeTop;

import java.util.HashMap;

public class T13 {
    HashMap<Character, Integer> map = new HashMap<>();

    public int romanToInt(String s) {
        init();
        int len = s.length();
        int res = 0, i = 0;
        while (i < len - 1){
            int x = map.get(s.charAt(i));
            int y = map.get(s.charAt(i+1));
            if (x < y){
                res += y - x;
                i += 2;
            }
            else {
                res += x;
                ++i;
            }
        }
        if (i==len-1)
            res += map.get(s.charAt(i));
        return res;
    }

    public void init(){
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }

    public static void main(String[] args) {
        T13 solution = new T13();
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}
