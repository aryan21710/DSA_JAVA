package DSA.BinaryTree.BinarySearchTree;

import DSA.BinaryTree.BFS.Setup;
import DSA.BinaryTree.Setup.Tree;
import DSA.BinaryTree.Setup.TreeNode;

import java.util.Scanner;

public class SearchForRange {
    static int count=0;
    public static void main(String[] args) {
        Setup myRange = new Setup();
        TreeNode node = myRange.createTree();
        Tree tree = new Tree();
        tree.bfsTraversal(node);
//        Scanner in = new Scanner(System.in);
//        int upper = in.nextInt();
//        int lower = in.nextInt();
//        System.out.println(searchBstForRange(upper, lower, node));
//        searchBstForRange1(upper, lower, node);
//        System.out.println(count);
        insertNodesInBst(node,4);
        System.out.println("\nAfter insertion");
        tree.bfsTraversal(node);


    }

    static int searchBstForRange(int upper, int lower, TreeNode node) {
        if (node==null) return 0;
        if (node.val >= lower && node.val <= upper)
            count++;
        searchBstForRange(upper, lower, node.left);
        searchBstForRange(upper, lower, node.right);
        return count;
    }

    static void searchBstForRange1(int upper, int lower, TreeNode node) {
        if (node==null) return;
        if (node.val <= upper && node.val >= lower)
            count++;
        searchBstForRange1(upper, lower,node.left);
        searchBstForRange1(upper, lower,node.right);
    }

    public static void insertNodesInBst(TreeNode root, int elem) {
        if (elem < root.val) {
            if (root.left==null) {
                root.left = new TreeNode(elem);
                return;
            }
            insertNodesInBst(root.left,elem);
        } else {
            if (root.right==null) {
                root.right = new TreeNode(elem);
                return;
            }
            insertNodesInBst(root.right,elem);
        }
    }
}
