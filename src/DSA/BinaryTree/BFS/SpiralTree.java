package DSA.BinaryTree.BFS;
import java.util.*;

class Node1 {
    int data;
    Node1 left, right;

    Node1(int value) {
        data = value;
        left = right = null;
    }
}

class Tree {
    Node1 root;
    static Stack<Node1> s = new Stack<>();

    Tree() {
        root = null;
    }

    // Method to construct a binary tree from the given array
    public Node1 insertNode(int[] elementsArr, Node1 node, int i) {
        if(i < elementsArr.length){
            node = new Node1(elementsArr[i]);
            node.left = insertNode(elementsArr,node.left,2 * i + 1);
            node.right = insertNode(elementsArr,node.right,2 * i + 2);
        }
        return node;
    }

    public void printNodesAtLevel(Node1 root, boolean ltr, int currentLevel, int level) {
        if (root==null) return;
        if (level == currentLevel) {
            System.out.print(root.data+" ");
        }
        if (ltr) {
            printNodesAtLevel(root.left,ltr,currentLevel+1,level);
            printNodesAtLevel(root.right,ltr,currentLevel+1,level);
        } else {
            printNodesAtLevel(root.right,ltr,currentLevel+1,level);
            printNodesAtLevel(root.left,ltr,currentLevel+1,level);
        }
    }

    public int height(Node1 root) {
        if (root==null) return 0;
        int hLeft = 1+ height(root.left);
        int hRight = 1+ height(root.right);
        if (hLeft > hRight)
            return hLeft;
        else
            return hRight;
    }

    public static void printNodesInSpiralOrder(Node1 root, int level, int currentLevel) {
        if (root==null) return;
        if (level==currentLevel && currentLevel%2==0) {
           while(!s.isEmpty())
               System.out.print(s.pop().data+" ");
           System.out.print(root.data+" ");
       } else if (level==currentLevel && currentLevel%2!=0) {
           s.push(root);
       } else {
                printNodesInSpiralOrder(root.left, level,currentLevel+1);
               printNodesInSpiralOrder(root.right, level,currentLevel+1);
        }
    }

    // Method to traverse the elements of a tree using BFS (level-order traversal) in the spiral order
    void spiralOrder(Node1 root) {
        // Write your code here
        int h = height(root);
        System.out.print(root.data+" ");
        for (int i = 2; i < h+1; i++)
            printNodesInSpiralOrder(root, i, 1);
        while(!s.isEmpty())
            System.out.print(s.pop().data+" ");

    }
}

// WARNING: Do not edit the code given below; otherwise the test cases might fail
class SpiralTree {
    public static void main(String[] x) {
        Tree tree = new Tree();

        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        if (size < 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++) {
                elementsArr[i] = sc.nextInt();
            }

            tree.root = tree.insertNode(elementsArr, tree.root, 0);

            tree.spiralOrder(tree.root);
        }
    }
}
