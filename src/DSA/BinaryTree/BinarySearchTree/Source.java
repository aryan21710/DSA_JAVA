package DSA.BinaryTree.BinarySearchTree;

import DSA.BinaryTree.BFS.Setup;
import DSA.BinaryTree.Setup.Tree;
import DSA.BinaryTree.Setup.TreeNode;

import java.util.Scanner;

public class Source {
    public static void main(String[] args) {
        Source bst = new Source();
        Setup myArr = new Setup();
        Tree tree = new Tree();
        tree.root= tree.insertNodes(myArr.CreateSortedArray(),tree.root,0);
        Scanner in = new Scanner(System.in);
        int element = in.nextInt();
        boolean status=bst.binarySearchTree(tree.root, element);
        if (status)
            System.out.println(element + " FOUND");
        else
            System.out.println("ELEMENT NOT FOUND");
    }


    public boolean binarySearchTree(TreeNode node,int element) {
        if (node==null)
            return false;
        if (element == node.val)
            return true;
        if (element < node.val)
            return binarySearchTree(node.left,element);
        else
            return binarySearchTree(node.right,element);
    }

}
