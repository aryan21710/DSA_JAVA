package DSA.BinaryTree.BFS;

import DSA.BinaryTree.Setup.TreeNode;
import DSA.BinaryTree.Setup.Tree;

import java.util.Scanner;

public class Setup {
    public int[] CreateSortedArray() {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        if (size <= 0) {
            return null;
        }

        int[] elementsArr = new int[size];
        for (int i = 0; i < size; i++) {
            elementsArr[i] = sc.nextInt();
        }

        DSA.Sorting.Bubble.Source mySort = new DSA.Sorting.Bubble.Source();

        elementsArr = mySort.bubbleSort(elementsArr);
        System.out.println("ARRAY ENTERED IN SORTED ORDER IS FOLLOWING");
        for (int i = 0; i < elementsArr.length; i++) {
            System.out.print(elementsArr[i]+" ");
        }
        System.out.println(" ");
        return elementsArr;
    }

    public TreeNode createTree() {
        Tree tree = new Tree();
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(3);
        node.left.left = new TreeNode(1);
        node.left.left.right = new TreeNode(2);

        node.right = new TreeNode(8);
        node.right.left = new TreeNode(6);
        node.right.left.right = new TreeNode(7);

        return node;
    }
}
