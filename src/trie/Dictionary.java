package trie;

public class Dictionary {
    public static void main(String args[]){
        Trie trie = new Trie();
        trie.insertWord("mango");
        trie.insertWord("monkey");
        trie.insertWord("don");
        trie.insertWord("donkey");
        System.out.println(trie.searchWord("ganga"));
        System.out.println(trie.searchWord("mango"));
        System.out.println(trie.searchWord("manko"));
        System.out.println(trie.searchWord("don"));
        System.out.println(trie.searchWord("donk"));
        System.out.println(trie.searchWord("donkey"));

    }
}
