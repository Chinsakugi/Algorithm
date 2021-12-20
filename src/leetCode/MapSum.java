package leetCode;

import java.util.HashMap;
import java.util.Map;

public class MapSum {

    class TrieNode{
        TrieNode[] child = new TrieNode[26];
        int val = 0;
    }

    TrieNode root;
    Map<String, Integer> map;

    public MapSum() {
        root = new TrieNode();
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        int delta = val - map.getOrDefault(key,0);
        map.put(key,val);
        TrieNode node = root;
        for (char c : key.toCharArray()){
            if (node.child[c-'a']==null)
                node.child[c-'a'] = new TrieNode();
            node = node.child[c-'a'];
            node.val += delta;
        }
    }

    public int sum(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()){
            if (node.child[c-'a']==null)
                return 0;
            node = node.child[c-'a'];
        }
        return node.val;
    }
}
