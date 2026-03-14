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

public class BinaryTree{
    static Node root;
    void preorder(Node root){
        if(root==null) return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    void inorder(Node root){
        if(root==null) return ;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    void postorder(Node root){
        if(root==null) return ;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");

    }
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Pre Order ->");
        tree.preorder(tree.root);
        
        System.out.println("In Order ->");
        tree.inorder(tree.root);

        System.out.println("Post Order->");
        tree.postorder(tree.root);

    }
}