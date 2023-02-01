package DSA.BinaryTree.BinarySearchTree;
import java.util.*;
public class GetLeafCount{
    public static class Node
    {
        int data;
        Node left, right;

        public Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    public static class BinaryTree
    {
        Node root;

        int leafCount=0;

        BinaryTree() {
            root = null;
        }

        // Function to insert in the BST
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

        int getLeafCount()
        {
            return getLeafCount(root);
        }

        int getLeafCount(Node node)
        {
            // complete the code here
            if (node.left == null && node.right == null) {
                leafCount++;
                return leafCount;
            }
            if (node.left != null && node.right == null) {
                getLeafCount(node.left);
            } else if (node.left == null && node.right != null) {
                getLeafCount(node.right);
            } else {
                getLeafCount(node.left);
                getLeafCount(node.right);
            }
            return leafCount;
        }
    }

    public static void main(String[] args)
    {

        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();

        if(size<= 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++){
                elementsArr[i] = sc.nextInt();
                tree.insert(elementsArr[i]);
            }
            System.out.println(tree.getLeafCount());
        }
    }



}
