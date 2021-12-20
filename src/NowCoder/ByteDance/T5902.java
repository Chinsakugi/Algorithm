package NowCoder.ByteDance;

public class T5902 {
    public boolean areNumbersAscending(String s) {
        String[] strs = s.split(" ");
        int num = 0;
        for (String str : strs){
            if (Character.isDigit(str.charAt(0))){
                if (Integer.parseInt(str)<=num)
                    return false;
                else
                    num = Integer.parseInt(str);
            }
        }
        return true;
    }
}
