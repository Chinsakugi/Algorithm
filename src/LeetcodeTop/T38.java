package LeetcodeTop;

public class T38 {
    public String countAndSay(int n) {
        String res = "1";
        for (int i=1;i<n;++i){
            res = fun(res);
        }
        return res;
    }



    public String fun(String str){
        int n = str.length();
        int l = 0, r = 0;
        StringBuffer res = new StringBuffer();
        while (r<n){
            if (str.charAt(r)==str.charAt(l))
                r++;
            else{
                res.append(r - l);
                res.append(str.charAt(l));
                l = r;
            }
        }
        res.append(r-l);
        res.append(str.charAt(l));
        return res.toString();
    }

    public static void main(String[] args) {
        T38 solution = new T38();
        System.out.println(solution.countAndSay(3));
    }
}
