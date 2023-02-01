package DSA.BinaryTree;

import DSA.BinaryTree.BFS.Setup;
import DSA.BinaryTree.Setup.TreeNode;

public class Exercise {
    public static void main(String[] args) {
        Setup s = new Setup();
        BinaryTree bst = new BinaryTree();
        bst.root = s.createTree();
        System.out.println(bst.func(bst.root));
    }
}



class BinaryTree {
    TreeNode root;

    public int func(TreeNode node) {
        if (node == null)
            return 0;
        else {
            int lfunc = func(node.left);
            int rfunc = func(node.right); //recursive call to traverse through the right side of the node
            if (lfunc > rfunc)
                return (lfunc + 1);
            else
                return (rfunc + 1);
        }
    }
}
