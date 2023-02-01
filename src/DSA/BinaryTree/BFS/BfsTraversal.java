package DSA.BinaryTree.BFS;

import DSA.BinaryTree.Setup.Tree;
import DSA.BinaryTree.Setup.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BfsTraversal {
    public static void main(String[] args) {
        BfsTraversal bfs = new BfsTraversal();
        int numOfNodes = 7;
        int[] arr = new int[numOfNodes];
        for (int i = 0; i < numOfNodes; i++)
            arr[i]=i+1;
        TreeNode root= createTree(arr,0,numOfNodes-1);
        int height = findHeight(root);
//        recursive(root,height);
        iterative(root);
    }

    public static TreeNode createTree(int[] arr, int start, int end) {
        if (start > end)
            return null;
        int median = (start + end)/2;
        TreeNode root = new TreeNode(arr[median]);
        root.left = createTree(arr, start, median-1);
        root.right = createTree(arr, median+1, end);
        return root;

    }

    public static void printNodesAtLevel(TreeNode root, int level, int currentLevel) {
        if (root == null) return;
        if (level == currentLevel)
            System.out.print(root.val+" ");
        else {
            printNodesAtLevel(root.left, level, currentLevel+1);
            printNodesAtLevel(root.right, level, currentLevel+1);
        }
    }
    public static void recursive(TreeNode node, int height) {
        for (int i = 1; i <= height; i++) {
            printNodesAtLevel(node, i, 1);
        }
    }

    public static int findHeight(TreeNode root) {
        if (root == null) return 0;
        int lheight = 1;
        int rheight = 1;
        TreeNode traverseLeft = root;
        TreeNode traverseRight = root;
        while(traverseLeft != null) {
            lheight++;
            traverseLeft = traverseLeft.left;
        }

        while(traverseRight != null) {
            rheight++;
            traverseRight = traverseRight.left;
        }

        return lheight > rheight ? lheight : rheight;
    }


    public static void iterative(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            TreeNode node = q.remove();
            int temp = node.val;
            System.out.print(temp+" ");
            if (node.left != null)
                q.add(node.left);
            if (node.right != null)
                q.add(node.right);
        }
    }
}
