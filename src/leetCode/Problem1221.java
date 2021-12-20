package leetCode;

public class Problem1221 {
    public int balancedStringSplit(String s) {
        int count = 0;
        int rnum = 0, lnum = 0;
        for (int i=0;i<s.length();++i){
            char c = s.charAt(i);
            if (c=='L')
                lnum++;
            else
                rnum++;
            if (lnum==rnum && lnum!=0){
                count++;
                lnum = 0;
                rnum = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Problem1221 solution = new Problem1221();
        System.out.println(solution.balancedStringSplit("RL"));
    }
}
