package Leetcode.Level1;

// https://leetcode.com/problems/merge-two-sorted-lists/?envType=study-plan&id=level-1

class ListNode {
  int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class MergeTwoSortedLinkedLists {
    public static void main(String[] args) {
        ListNode list1= new ListNode(5, new ListNode(10, new ListNode(15)));
        ListNode list2= new ListNode(2, new ListNode(3, new ListNode(20)));
        ListNode output=mergeTwoLists(list1,list2);
        if (output!=null) {
            while(output.next!=null) {
                System.out.print(output.val+"->");
                output = output.next;
            }
            System.out.print(output.val);
        }
    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null)
            return list2;
        if (list2 == null)
            return list1;
       ListNode temp = new ListNode();
       ListNode head = temp;

       while(list1 !=null && list2 != null) {
           if (list1.val < list2.val) {
               temp.next = list1;
               list1 = list1.next;
           } else {
               temp.next = list2;
               list2 = list2.next;
           }
           temp = temp.next;
       }
       if (list1!=null)
           temp.next = list1;
       if (list2!=null)
           temp.next = list2;
        return head.next;
    }

}
