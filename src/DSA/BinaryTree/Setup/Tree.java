package DSA.BinaryTree.Setup;

import DSA.BinaryTree.BinarySearchTree.GetLeafCount;

import java.util.*;

public class Tree {
    public TreeNode root;
    int maxHeight;
    public Tree() {
        root = null;
    }

    public TreeNode insertNodes(int[] arr, TreeNode node, int i) {
        if (i < arr.length) {
            node = new TreeNode(arr[i]);
            node.left = insertNodes(arr,node.left,2*i+1);
            node.right = insertNodes(arr,node.right,2*i+2);
        }
        return node;
    }

    public void printNodes(TreeNode node){
        this.maxHeight++;
        if(node == null){
            System.out.print(maxHeight);
            return;
        }

        if(root.val==0){
            System.out.println("Division by zero is undefined");
            return;
        }

        printNodes(node.left);

//        if(node.data%root.data==0){
//            System.out.print(node.data + " ");
//        }

        printNodes(node.right);
    }

    public TreeNode mirror(TreeNode node) {
        TreeNode temp;
        if (node==null) return null;
        mirror(node.left);
        mirror(node.right);
        temp=node.left;
        node.left=node.right;
        node.right=temp;
        return node;
    }

    public void traverse(TreeNode root, int level, int currentLevel) {
        if (root == null) return;
        if (level == currentLevel) {
            System.out.print(root.val+" ");
        } else {
            traverse(root.left, level, currentLevel+1);
            traverse(root.right, level, currentLevel+1);
        }
    }

    public int height(TreeNode node) {
        if (node==null) return 0;
        int hLeft = 1+ height(node.left);
        int hRight = 1+ height(node.right);
        if (hLeft > hRight)
            return hLeft;
        else
            return hRight;
    }

    public void bfsTraversal(TreeNode node) {
        int h = height(node);
        for (int i = 1; i <= h; i++) {
            traverse(node, i, 1);
        }
    }

    public void printNodesAtLevel(TreeNode node, boolean ltr, int currentLevel, int level) {
        if (node==null) return;
        if (level == currentLevel) {
            System.out.print(node.val+" ");
        }
        if (ltr) {
            printNodesAtLevel(node.left,ltr,currentLevel+1,level);
            printNodesAtLevel(node.right,ltr,currentLevel+1,level);
        } else {
            printNodesAtLevel(node.right,ltr,currentLevel+1,level);
            printNodesAtLevel(node.left,ltr,currentLevel+1,level);
        }
    }

    public void spiralOrder() {
        boolean ltr = false;
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            printNodesAtLevel(root,ltr,1,i);
            ltr=!ltr;
        }
    }



    public boolean checkForPalindrome(String nodeValues) {
        Stack<Character> myStack = new Stack<>();
        String output="";
        for (Character c: nodeValues.toCharArray())
            myStack.push(c);

        while(!myStack.isEmpty())
            output+=myStack.pop();

        return output==nodeValues ? true : false;
    }

    public void modifiedBfsTraversal(TreeNode node, int level, int currentLevel, String nodeValues) {
        if (node==null) return;
        if (level == currentLevel) {
            if (level > 1)
                nodeValues+=node.val;
        } else {
            modifiedBfsTraversal(node.left, level, currentLevel+1, nodeValues);
            modifiedBfsTraversal(node.right, level, currentLevel+1, nodeValues);
        }
    }


    public void symmetricTree(TreeNode node) {
        int h = height(node);
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 1; i <= h; i++) {
            String nodeValues = "";
            modifiedBfsTraversal(node, i, 1, nodeValues);
            if (nodeValues.length() > 0) {
                map.put(i,checkForPalindrome(nodeValues));
            }
        }

        for (Integer s: map.keySet()) {
            if (map.get(s) == false) {
                System.out.println("NOT A SYMMETRIC TREE");
                break;
            }
        }

        System.out.println("ITS A SYMMETRIC TREE");
    }



    public int findMax(TreeNode node)
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        int maxVal=-1;

        while(!q.isEmpty()) {
            TreeNode temp = q.peek();
            if (temp.val > maxVal) {
                maxVal = q.remove().val;
            }

            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }
        return maxVal;
    }

}

