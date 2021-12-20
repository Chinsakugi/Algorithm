package LeetcodeTop;

public class T171 {
    public int titleToNumber(String columnTitle) {
        int res = 0, num = 1;
        for (int i=columnTitle.length()-1;i>=0;--i){
            res += (columnTitle.charAt(i) - 'A' + 1) * num;
            num *= 26;
        }
        return res;
    }
}
