package Leetcode.Level1;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};


public class NarytreePreOrderTraversal {

    public static void main(String[] args) {


        List<Node> childrenOf1=new ArrayList<>();
        List<Node> childrenOf3=new ArrayList<>();
        Node children3=new Node(3, childrenOf3);

        childrenOf3.add(null);
        childrenOf3.add(new Node(5));
        childrenOf3.add(new Node(6));


        childrenOf1.add(null);
        childrenOf1.add(children3);
        childrenOf1.add(new Node(2));
        childrenOf1.add(new Node(4));

        Node root = new Node(1,childrenOf1);
        List<Integer> list=preorder(root);
        for(Integer val: list)
            System.out.print(val+" ");

    }
    public static List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversal(root, list);
        return list;

    }

    public static void preorderTraversal(Node root, List<Integer> list) {
        if (root==null) return;
        list.add(root.val);
        if (root.children!=null) {
            for(Node node: root.children) {
                preorderTraversal(node, list);
            }
        }
    }

}
