import java.util.*;

class Node{
    Node[] children;
    boolean isEnd;

    Node(){
        this.children = new Node[26]; //a-z
        this.isEnd = false;
    }
}

public class trieNode{
    Node root;

    trieNode(){
        root = new Node();
    }

    public void insert(String word){
        Node curr = root;
        for(char ch:word.toCharArray()){
            int index = ch - 'a';

            if(curr.children[index] == null){
                curr.children[index]=new Node();
            }
            curr = curr.children[index];
        }
        curr.isEnd = true;
    }

    boolean search(String word){
        Node curr = root;
        for(char ch:word.toCharArray()){
            int index = ch - 'a';

            if(curr.children[index] == null){
                return false;
            }
            curr = curr.children[index];
        }
        return curr.isEnd;
    }

    public static void main(String[] args){
        trieNode t = new trieNode();

        t.insert("cat");
        t.insert("car");
        t.insert("dog");

        System.out.println(t.search("cat"));
        System.out.println(t.search("can"));
    }
}