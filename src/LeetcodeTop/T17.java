package LeetcodeTop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class T17 {
    HashMap<Character, String> map = new HashMap<>();
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        mapInit();
        if (digits.length()==0)
            return res;
        backTack(digits,new StringBuffer(),0);
        return res;
    }

    void backTack(String digits, StringBuffer combination,int index){
        if (index==digits.length())
            res.add(combination.toString());
        else {
            char digit = digits.charAt(index);
            String letter = map.get(digit);
            for (int i=0;i<letter.length();i++){
                combination.append(letter.charAt(i));
                backTack(digits,combination,index+1);
                combination.deleteCharAt(index);
            }
        }
    }


    void mapInit(){
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    }
}
