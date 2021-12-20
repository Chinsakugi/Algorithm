package leetcode周赛.Day1024;

public class T5906 {
    public int countValidWords(String sentence) {
        String[] str = sentence.trim().split(" ");
        int sum = 0;
        for (String word : str){
            sum += isWord(word)?1:0;
        }
        return sum;
    }

    public static boolean isWord(String str){
        if (str==null)
            return false;
        if (str.isEmpty())
            return false;
        if (str.equals(" "))
            return false;
        int n = str.length();
        int num = 0;
        for (int i=0;i<n;++i){
            char ch = str.charAt(i);
            if (Character.isDigit(ch))
                return false;
            if (ch=='-'){
                ++num;
                if(num>1||i==0||i==n-1||!Character.isLetter(str.charAt(i+1)))
                    return false;
            }
            if ((ch=='!'||ch=='.'||ch==',')&&i!=n-1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        T5906 solution = new T5906();
        System.out.println(solution.countValidWords("cat and  dog"));
    }

}
