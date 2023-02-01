package DSA.BinaryTree.BFS;

import DSA.BinaryTree.Setup.TreeNode;

import java.util.*;

class BinaryTree {

    TreeNode root;

    BinaryTree(){
        root = null;
    }

    // Method to construct a binary tree from the given array
    public TreeNode insertNode(int[] elementsArr, TreeNode node, int i){
        if(i < elementsArr.length){
            node = new TreeNode(elementsArr[i]);

            node.left = insertNode(elementsArr,node.left,2 * i + 1);
            node.right = insertNode(elementsArr,node.right,2 * i + 2);
        }
        return node;
    }

    // Method to find the largest value in the tree
    public int findMax(TreeNode node)
    {
        //Write your code here.
        if (node == null)
            return -1;
        Queue<TreeNode> q = new LinkedList<>();
        int maxVal=-1;
        q.add(node);
        while(!q.isEmpty()) {
            TreeNode root = q.remove();
            int temp = root.val ;
            if (temp > maxVal)
                maxVal = temp;
            if (root.left != null)
                q.add(root.left);
            if (root.right != null)
                q.add(root.right);
        }

        return maxVal;
    }
}
// WARNING: Do not edit the code given below; otherwise the test cases might fail
public class PrintMax{
    public static void main(String[] x){
        BinaryTree tree = new BinaryTree();

        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        if(size == 0){
            System.out.println("-1");
        }

        else if (size < 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++){
                elementsArr[i] = sc.nextInt();
            }

            tree.root = tree.insertNode(elementsArr,tree.root,0);

            System.out.println(tree.findMax(tree.root));
        }
    }
}
