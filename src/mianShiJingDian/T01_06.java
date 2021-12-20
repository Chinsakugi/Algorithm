package mianShiJingDian;

public class T01_06 {
    public String compressString(String S) {
        if(S.length()==0)
            return S;
        int len = S.length();
        StringBuffer res = new StringBuffer();
        char ch = S.charAt(0);
        int num = 0;
        for (int i=0;i<len;++i){
            if (S.charAt(i)==ch){
                ++num;
            }else {
                res.append(ch);
                res.append(num);
                ch = S.charAt(i);
                num = 1;
            }
        }
        res.append(ch);
        res.append(num);
        if (res.length() < len)
            return res.toString();
        else
            return S;
    }


    public static void main(String[] args) {
        T01_06 solution = new T01_06();
        System.out.println(solution.compressString("aasdfffff"));
    }

}
