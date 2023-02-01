package DSA.BinaryTree.BinarySearchTree;

import DSA.BinaryTree.TreeNode;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class BST {
    Node root;

    BST() {
        root = null;
    }

    // Method to construct a binary tree from the given array
    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in BST
    Node insertRec(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }

    // Method to find the lowest common ancestor of two nodes - n1 and n2
    Node lca(Node node, int n1, int n2) {
        // cpmplete the code for this method
        if (node==null) return null;
        if (n1 < node.data && n2 < node.data)
            node = lca(node.left,n1,n2);
        else if (n1 > node.data && n2 > node.data)
        node = lca(node.right,n1,n2);
        else
            return node;
        return node;
    }

    public void postOrderTraversal1(Node node) {
        if (node==null) return;
        postOrderTraversal1(node.left);
        postOrderTraversal1(node.right);
        System.out.print(node.data+" ");
    }

    public  Node lca1(Node root, int upper, int lower) {
        if (root==null) return null;
        if (upper >= root.data && root.data >= lower)
            return root;
        if (lower < root.data && upper < root.data)
            return lca1(root.left,upper, lower);
        else
            return lca1(root.right,upper, lower);
    }

}






// WARNING: Do not edit the code given below; otherwise the test cases might fail
public class LowestCommonAncestor {
    public static void main(String[] x) {
        BST bst = new BST();

        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        if(size>0){
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++) {
                elementsArr[i] = sc.nextInt();
                bst.insert(elementsArr[i]);
            }

//            bst.postOrderTraversal1(bst.root);

          int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println("n1 & n2 "+n1+" "+n2);

//            Node lca = bst.lca(bst.root, n1, n2);
            Node lca1 = bst.lca1(bst.root, n1, n2);
//            System.out.print(lca.data);
            System.out.print("output"+lca1.data);
        }
        else
            System.out.println("Size should be a positive integer");
    }
}
