package DSA.BinaryTree.BinarySearchTree;

import java.util.Scanner;
import java.util.Arrays;


class BinaryTree
{

    class Node
    {
        int value;
        Node leftchild, rightchild;

        Node(int item)
        {
            value = item;
            leftchild = rightchild = null;
        }
    }
    Node root;
    static int preIndex = 0;
    static int index=0;

    Node constructTree(int in[], int pre[], int inStrt, int inEnd)
    {
        if (inStrt > inEnd)
            return null;

        Node tNode = new Node(pre[preIndex++]);

        if (inStrt == inEnd)
            return tNode;

        int inIndex = search(in, inStrt, inEnd, tNode.value);

        tNode.leftchild = constructTree(in, pre, inStrt, inIndex - 1);
        tNode.rightchild = constructTree(in, pre, inIndex + 1, inEnd);

        return tNode;
    }

    int search(int arr[], int strt, int end, int value)
    {
        int i;
        for (i = strt; i <= end; i++)
        {
            if (arr[i] == value)
                return i;
        }
        return i;
    }

    int sumBinaryTree(Node node)
    {
        // Write the logic to recursively create Binary Tree consisting of sum of all its children
        if (node==null) return 0;
        node.value=node.value+sumBinaryTree(node.leftchild)+sumBinaryTree(node.rightchild);
        return node.value;
    }

    void printPostorder(Node node)
    {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.leftchild);

        // then recur on right subtree
        printPostorder(node.rightchild);

        // now deal with the node
        System.out.print(node.value + " ");
    }

    void inOrder(Node node, int array[])
    {
        if (node == null)
            return;
        inOrder(node.leftchild, array);
        System.out.print(node.value+" ");
        array[index++] = node.value;
        inOrder(node.rightchild, array);

    }

    Node ArrayToBST(int arr[], int start, int end) {
        // Write logic to convert the array representing Binary Tree to Binary Search Tree
        if (start > end) return null;
        int med = (start + end)/2;
        BinaryTree.Node node = new Node(arr[med]);
        node.leftchild =  ArrayToBST(arr, start, med-1);
        node.rightchild =  ArrayToBST(arr, med+1, end);
        return node;
    }
}
class Exercise{

    // driver program to test above functions
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int in[] = {40,60,30,20,50};
        int pre[] = {50,20,30,60,40};
        int len = in.length;

//        for(int i=0;i<len;i++){
//            in[i] = scanner.nextInt();
//        }
//        for(int i=0;i<len;i++){
//            pre[i] = scanner.nextInt();
//        }
        BinaryTree tree = new BinaryTree();
        BinaryTree.Node root = tree.constructTree(in, pre, 0, len - 1);
        tree.sumBinaryTree(root);
        int inSumTree[] = new int[len];
        System.out.println("");
        tree.inOrder(root, inSumTree);
        Arrays.sort(inSumTree);
        System.out.println("");
        for (int i = 0; i < inSumTree.length; i++) {
            System.out.print(inSumTree[i]+" ");
        }
        BinaryTree.Node bstRoot = tree.ArrayToBST(inSumTree, 0, len-1);
        System.out.println("");
        tree.printPostorder(bstRoot);

    }
}

