import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class BST{
    static Node root;
    void insert(int data){
        root = insertNode(root,data);
    }

    Node insertNode(Node root, int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insertNode(root.left,data);
        }
        else{
            root.right = insertNode(root.right,data);
        }
        return root;
    }

    boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(key < root.data){
            return search(root.left, key);
        }
        else{
            return search(root.right,key);
        }
    }

    void inorder(Node root){
        if(root==null) return ;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    Node findSucc(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
    Node delete(Node root, int key){
        if(root == null){
            return null;
        }
        else if(key<root.data){
            root.left = delete(root.left, key);
        }

        else if(key>root.data){
            root.right = delete(root.right, key);
        }

        //case 1: leaf node
        else{
            if(root.left == null && root.right == null){
                return null;
            }
            
            //case 2: one child
            if(root.left==null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }

            //case 3: two childs
            Node succ = findSucc(root.right);
            root.data = succ.data;
            root.right = delete(root.right,succ.data);
        }
        return root;
    }

    public static void main(String[] args){
        BST tree = new BST();
        tree.insert(8);
        tree.insert(6);
        tree.insert(5);
        tree.insert(10);
        tree.insert(12);
        tree.insert(20);
        tree.insert(11);

        /*
        int[] values = {8,6,5,10,12,20,11};
        for(int i = values){
            tree.root = tree.root(tree.root,i);
        }
        */


        tree.inorder(root);
        System.out.println();
        System.out.println("Found:" +tree.search(root,11));
        System.out.println("Found:" +tree.search(root,55));

        tree.delete(root,8);
        tree.inorder(root);

    }
}