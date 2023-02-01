package DSA.BinaryTree.Dfs;

import DSA.BinaryTree.Setup.TreeNode;

import java.util.*;


public class AllTraversal {
    static ArrayList<Integer>list = new ArrayList<>();
    public static void main(String[] args) {
        AllTraversal traversal = new AllTraversal();
        Scanner in = new Scanner(System.in);
//        int noOfNodes = in.nextInt();
//        int[] arr = new int[noOfNodes];
//        for (int i = 0; i < noOfNodes; i++) {
//            arr[i]=i+1;
//        }
//
//        TreeNode root = insertFromArray(arr, 0, noOfNodes-1);

        TreeNode root = new TreeNode(25);
        root.left = new TreeNode(15);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(22);
        root.left.left.left = new TreeNode(4);
       root.left.left.right = new TreeNode(12);

        root.left.right.left = new TreeNode(18);
        root.left.right.right = new TreeNode(24);

        root.right = new TreeNode(50);
        root.right.left = new TreeNode(31);
        root.right.right = new TreeNode(44);
        root.right.left.left = new TreeNode(30);
        root.right.left.right = new TreeNode(20);

        root.right.right.left = new TreeNode(66);
        root.right.right.right = new TreeNode(90);

        System.out.println(getLeafCount(root));

//        System.out.println("Pre order Traversal");
//        traversal.preorderTraversal(root);
//        System.out.println("\nPost order Traversal");
//        traversal.postOrderTraversal(root);
//        System.out.println("\nIn order Traversal");
//        traversal.InOrderTraversal(root);
//        System.out.println("\nHeight of the tree is "+ findHeight(root));
//        heightBalanced(root);

    }


    public static int getLeafCount(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return getLeafCount(root.left)+ getLeafCount(root.right);
    }


    public static TreeNode insertFromArray(int[] arr, int start, int end) {
        // This will make a balanced Binary tree;
        if (start > end)
            return null;
        int median = (start + end)/2;
        TreeNode root = new TreeNode(arr[median]);
        root.left = insertFromArray(arr, start, median-1);
        root.right = insertFromArray(arr, median+1, end);
        return root;
    }

    public static void heightBalanced(TreeNode root) {
        /*
               A height balanced binary tree is a binary tree
               in which the height of the left subtree and right subtree
                of any node does not differ by more than 1 and
                 both the left and right subtree are also height balanced.

        */

        if (root==null) return;
        int lheight=1;
        int rheight =1;
        TreeNode traverseLeft = root;
        while (traverseLeft.left!=null) {
            lheight++;
            traverseLeft=traverseLeft.left;
        }
        TreeNode traverseRight = root;

        while (traverseRight.right!=null) {
            rheight++;
            traverseRight=traverseRight.right;
        }

        if (Math.abs(lheight-rheight) <=1)
            System.out.println("Tree is height balanced");
        else
            System.out.println("Tree is not height balanced");
    }

    public static int findHeight(TreeNode root) {
        if (root==null) return 0;
        int left=1;
        int right =1;
        TreeNode traverseLeft = root;
        while (traverseLeft.left!=null) {
            left++;
            traverseLeft=traverseLeft.left;
        }
        TreeNode traverseRight = root;

        while (traverseRight.right!=null) {
            right++;
            traverseRight=traverseRight.right;
        }

        return left > right ? left : right;
    }



    public void InOrderTraversal(TreeNode node) {
        if (node == null) return;
        InOrderTraversal(node.left);
        System.out.print(node.val+" ");
        InOrderTraversal(node.right);
    }


    public void preorderTraversal(TreeNode node) {
        if (node == null) return;
        System.out.print(node.val+" ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public void postOrderTraversal(TreeNode node) {
        if (node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.val+" ");
    }
}
