package leetCode;

public class Problem520 {
    public boolean detectCapitalUse(String word) {
        boolean flag = Character.isUpperCase(word.charAt(0));
        if (flag){
            int n = word.length();
            int i = 1;
            if (n<=i)
                return true;
            while (i<n&&Character.isUpperCase(word.charAt(i))==Character.isUpperCase(word.charAt(i+1)))
                ++i;
            return i==n-1;
        }else{
            for (int i=0;i<word.length();++i){
                if (Character.isUpperCase(word.charAt(i)))
                    return false;
            }
            return true;
        }
    }
}
