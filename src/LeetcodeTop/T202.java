package LeetcodeTop;

import java.util.HashSet;

public class T202 {
    public boolean isHappy(int n) {
        if(n==1)
            return true;
        HashSet<Integer> set = new HashSet<>();
        while (n!=1){
            if (set.contains(n))
                return false;
            set.add(n);
            n = bitSum(n);
        }
        return true;
    }

    public int bitSum(int n){
        int res = 0;
        while (n > 0){
            res += (n % 10) * (n %10);
            n = n /10;
        }
        return res;
    }

    public static void main(String[] args) {
        T202 solution = new T202();
        System.out.println(solution.isHappy(19));
    }
}
