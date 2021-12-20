package LeetcodeTop;

public class T69 {
    public int mySqrt(int x) {
        if (x==0||x==1)
            return x;
        long l=0, r = x;
        while (l < r){
            long mid = l + (r - l) / 2;
            if (mid * mid == x )
                return (int) mid;
            else if (mid * mid < x){
                if ((mid+ 1) * (mid+1) > x)
                    return (int) mid;
                l = mid + 1;
            }
            else
                r = mid - 1;
        }
        return (int) l;
    }

    public static void main(String[] args) {
        T69 solution = new T69();
        System.out.println(solution.mySqrt(2147395599));
    }
}
