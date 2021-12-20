package LeetcodeTop;

public class T50 {
    public double myPow(double x, int n) {
        if (n==0)
            return 1.0;
        if (n==1)
            return x;
        if (n==-1)
            return 1.0 / x;
        if (Math.abs(x - 1.0) <=0.000001 || Math.abs(x + 1.0) <= 0.000001)
            return x > 0 ? x : (n % 2==0 ? -x : x);
        double temp =  myPow(x,n/2) ;
        temp = temp * temp;
        if (n % 2 == 0)
            return  temp;
        else
            return n > 0 ? temp * x : temp * (1.0 / x) ;
    }

    public static void main(String[] args) {
        T50 solution = new T50();
        System.out.println(solution.myPow(1.0,-2));
    }
}
