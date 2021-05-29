package Week8;

public class Trie {
    private Trie[] children;
    private boolean isEnd;

    /** Initialize your data structure here. */
    public Trie() {
        //初始化26个格子，装26个字母，索引是0-25
        children = new Trie[26];
        isEnd = false;
    }


    /** Inserts a word into the trie. */
    public void insert(String word) {
        //获取前缀树
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            //计算当前字符在前缀树中的索引，如果这个位置有Trie，说明当前的字符已经插过了
            int index = ch - 'a';
            if (node.children[index] == null) {
                //当前的位置没有Trie，说明没插过，就插入一个Trie表示当前位置有这个字符插入了
                node.children[index] = new Trie();
            }
            //这个把当前字符的前缀树作为下个搜索的结点，Trie中的chidrean数组其实就是插入单词的             //当前的字符的后面的字符
            node = node.children[index];
        }
        //表示当前的字符是某个字符串的结尾
        node.isEnd = true;
    }

    /** Returns if the word is in the trie. */

    public boolean search(String word) {
        //主要看当前的字符是不是结尾字符，还是说只是当前单词的一个前缀而已
        Trie node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }
    private Trie searchPrefix(String prefix) {
        Trie node = this;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            int index = ch - 'a';
            //这里没搜到，说明当前字符后面没有字符了，没有完全匹配prefix，直接返回false表示
            //不匹配
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        //这里是返回最后的字符的前缀树
        return node;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */