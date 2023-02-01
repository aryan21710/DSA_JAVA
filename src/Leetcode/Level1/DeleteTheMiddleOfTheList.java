package Leetcode.Level1;

public class DeleteTheMiddleOfTheList {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(7, new ListNode(1,new ListNode(2, new ListNode(6)))))));
//        ListNode head = new ListNode(2, new ListNode(3));
        ListNode head = new ListNode(2);
        ListNode newHead = deleteMiddle(head);
        if (newHead!=null) {
            while(newHead!=null || newHead.next!=null) {
                System.out.print(newHead.val+"->");
                newHead= newHead.next;
            }
            System.out.print(newHead.val);
        }


    }
    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next==null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        ListNode next = null;
        while(fast!=null && fast.next!=null) {
            prev = slow;
            slow = slow.next;
            next = slow.next;
            fast = fast.next.next;
        }
        if (prev!=null)
             prev.next = next;
        return head;
    }
}
