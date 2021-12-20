package LeetcodeTop;

public class T125 {
    public boolean isPalindrome(String s) {
        int n = s.length();
        if (n==1)
            return true;
        int l = 0, r = n-1;
        s =s.toLowerCase();
        while (l<=r){
            while (l<=r&&!Character.isLetterOrDigit(s.charAt(l)))
                l++;
            while (l<=r&&!Character.isLetterOrDigit(s.charAt(r)))
                r--;
            if (l>r)
                break;
            if (Character.isDigit(s.charAt(l))&&Character.isDigit(s.charAt(r))){
                if (s.charAt(l)==s.charAt(r)){
                    l++;
                    r--;
                }else
                    return false;
            }else if(Character.isLetter(s.charAt(l))&&Character.isLetter(s.charAt(r))){
                if (s.charAt(l)==s.charAt(r)){
                    l++;
                    r--;
                }else
                    return false;
            }else
                return false;
        }
        return true;
    }
}
