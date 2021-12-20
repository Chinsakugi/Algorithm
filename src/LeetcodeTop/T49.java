package LeetcodeTop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class T49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for (String str : strs){
            int[] counts = new int[26];
            for (int i=0;i<str.length();++i)
                counts[str.charAt(i)-'a']++;
            StringBuffer s = new StringBuffer();
            for (int i=0;i<26;++i){
                if (counts[i]!=0){
                    s.append((char) ('a'+i));
                    s.append(counts[i]);
                }
            }
            String key = s.toString();
            List<String> list = map.getOrDefault(key,new ArrayList<String>());
            list.add(str);
            map.put(key,list);
        }
        return new ArrayList<List<String>>(map.values());
    }

    public static void main(String[] args) {
        T49 solution = new T49();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(solution.groupAnagrams(strs).toString());
    }
}
