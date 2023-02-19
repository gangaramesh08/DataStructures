package trie;

public class Trie {

    private static final int MAX_SIZE = 26;

    Trie[] children = new Trie[MAX_SIZE];
    char value;
    boolean isEndWord;

    Trie root;


    public Trie() {
        this.isEndWord = false;
        for(int i=0; i< MAX_SIZE; i++){
            this.children[i] = null;
        }
    }

    public void insertWord(String word) {
        if(this.root==null) {
            root = new Trie();
        }
        Trie temp = root;
        for(int i=0; i<word.length();i++) {
            int index = word.charAt(i) - 'a';
            if(temp.children[index]==null) {
                temp.children[index] = new Trie();
            }
            temp = temp.children[index];
        }
        temp.isEndWord= true;
    }

    public boolean searchWord(String word) {
        Trie temp = this.root;
        for(int i=0;i<word.length();i++) {
            if(temp == null){
                return false;
            }
            temp = temp.children[word.charAt(i)-'a'];
        }
        return temp.isEndWord;
    }
}
