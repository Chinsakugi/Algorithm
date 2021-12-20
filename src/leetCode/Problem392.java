package leetCode;

public class Problem392 {
    public boolean isSubsequence(String s, String t) {
        int flag = 0;
        int num = 0;
        for (int i=0;i<s.length();++i){
            if (flag == t.length() - 1)
                return false;
            for (int j=flag;j<t.length();++j){
                if (s.charAt(i)==t.charAt(j)) {
                    flag = j;
                    ++num;
                    break;
                }
            }
        }

        return s.length() == num;
    }
}
