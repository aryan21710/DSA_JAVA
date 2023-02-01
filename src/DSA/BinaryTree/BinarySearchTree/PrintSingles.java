package DSA.BinaryTree.BinarySearchTree;
import java.util.*;



// WARNING: Do not edit code below this; failing which your solution may not pass the test case(s)
public class PrintSingles {
    private class Node {
        int data;
        DSA.BinaryTree.BinarySearchTree.Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    static class BinaryTree {
        DSA.BinaryTree.BinarySearchTree.Node root;

        BinaryTree() {
            root = null;
        }

        void insert(int key) {
            root = insertRec(root, key);
        }

        // A recursive function to insert a new key in BST
        DSA.BinaryTree.BinarySearchTree.Node insertRec(DSA.BinaryTree.BinarySearchTree.Node root, int key) {

            if (root == null) {
                root = new DSA.BinaryTree.BinarySearchTree.Node(key);
                return root;
            }

            if (key < root.data)
                root.left = insertRec(root.left, key);
            else if (key > root.data)
                root.right = insertRec(root.right, key);

            return root;
        }

        //Function to print nodes that dont have a sibling
        void printSingles(DSA.BinaryTree.BinarySearchTree.Node node) {
            // complete this function
            if (node.left == null && node.right==null) return;
            if (node.left == null && node.right != null) {
                System.out.print(node.right.data+" ");
                printSingles(node.right);
            } else if  (node.left != null && node.right == null) {
                System.out.print(node.left.data+" ");
                printSingles(node.left);
            } else {
                printSingles(node.left);
                printSingles(node.right);
            }
        }
    }
    public static void main(String args[]) {
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
            tree.printSingles(tree.root);
        }
    }
}
