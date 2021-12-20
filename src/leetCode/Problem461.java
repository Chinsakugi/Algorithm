package leetCode;

public class Problem461 {
    public int hammingDistance(int x, int y) {
        int sum = 0;
        while ((x | y) !=0){
            if((x^y)%2!=0) {
                ++sum;
            }
            x = x>>1;
            y = y>>1;
        }
        return sum;
    }

    public static void main(String[] args) {
        Problem461 problem = new Problem461();
        System.out.println(problem.hammingDistance(1,4));
    }
}
