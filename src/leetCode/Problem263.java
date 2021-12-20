package leetCode;

public class Problem263 {
    public boolean isUgly(int n) {
        if(n==1){
            return true;
        }
        if (n==0) {
            return false;
        }
        if (n%2==0){
            return isUgly(n/2);
        }
        if (n%3==0){
            return isUgly(n/3);
        }
        if (n%5==0){
            return isUgly(n/5);
        }
        return false;
    }

    public static void main(String[] args) {
        Problem263 problem = new Problem263();
        System.out.println(problem.isUgly(6));
    }
}
