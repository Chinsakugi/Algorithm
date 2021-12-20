package LeetcodeTop;

public class T172 {
    public int trailingZeroes(int n) {
        int zero = 0;
        long x = 5;
        while (n >=x){
            zero += n / x;
            x *= 5;
        }
        return zero;
    }

    public static void main(String[] args) {
        T172 solution = new T172();
        System.out.println(solution.trailingZeroes(15 ));
    }
}
