package Leetcode.Level1;

// https://leetcode.com/problems/reverse-linked-list/?envType=study-plan&id=level-1

public class ReverseALinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        reverseList(head);
    }
    public static ListNode reverseList(ListNode head) {
       ListNode prevToPrev = null;
       ListNode current = head;
       ListNode prev = null;
       while(current.next!=null) {
           prev = current;
           current = current.next;
           prev.next = prevToPrev;
           prevToPrev = prev;
       }
       prev = current;
       prev.next = prevToPrev;
       return prev;
    }
}
