package DSA.BinaryTree.BFS;

import DSA.BinaryTree.Setup.Tree;
import DSA.BinaryTree.Setup.TreeNode;

public class SymmetricTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(2);
        tree.root.left.left = new TreeNode(7);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(5);
        tree.root.right.right = new TreeNode(8);
        tree.symmetricTree(tree.root);
    }
}
