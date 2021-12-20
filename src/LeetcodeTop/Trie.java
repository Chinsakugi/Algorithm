package LeetcodeTop;

public class Trie {

    Trie[] child;
    boolean isEnd;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        child = new Trie[26];
        isEnd =false;
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        Trie node = this;
        for (int i=0;i<word.length();++i){
            int index = word.charAt(i) - 'a';
            if (node.child[index]==null)
                node.child[index] = new Trie();
            node = node.child[index];
        }
        node.isEnd = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        Trie node = this;
        for (int i=0;i<word.length();++i){
            int index = word.charAt(i) - 'a';
            if (node.child[index]==null)
                return false;
            node = node.child[index];
        }
        return node.isEnd;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        Trie node = this;
        for (int i=0;i<prefix.length();++i){
            int index =prefix.charAt(i) - 'a';
            if (node.child[index]==null)
                return false;
            node = node.child[index];
        }
        return true;
    }
}
