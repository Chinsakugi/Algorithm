package leetCode;

import java.util.HashMap;

public class Problem299 {
    public String getHint(String secret, String guess) {
        int n = secret.length();
        int x = 0, y = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0;i<n;++i){
            if (secret.charAt(i)==guess.charAt(i))
                ++x;
            if (map.containsKey(secret.charAt(i)))
                map.put(secret.charAt(i),map.get(secret.charAt(i))+1);
            else
                map.put(secret.charAt(i),1);
        }
        for (int i=0;i<n;++i){
            char ch = guess.charAt(i);
            if (map.containsKey(ch)){
                int m = map.get(ch);
                if (m<=0)
                    continue;
                map.put(ch,m-1);
                ++y;
            }
        }
        return Integer.toString(x)+"A"+Integer.toString(y-x)+"B";
    }

    public static void main(String[] args) {
        Problem299 problem299 = new Problem299();
        System.out.println(problem299.getHint("1423","1122"));
    }
}


