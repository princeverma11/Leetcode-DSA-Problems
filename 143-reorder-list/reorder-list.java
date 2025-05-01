/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        

        ListNode middle = middleNode(head); 
        ListNode revHead = reverseList(middle.next);
        middle.next = null;
        ListNode t1 = head;
        ListNode t2 = revHead;


        while(t2 != null)
        {
           ListNode temp_nextoft1 = t1.next;
           ListNode temp_nextoft2 = t2.next;
           t1.next = t2;
           t2.next = temp_nextoft1;
           
           t1 = temp_nextoft1;
           t2 = temp_nextoft2;
        }
    }


public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null  )
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }



public ListNode reverseList(ListNode head) {
        if(head ==null || head.next == null) return head;
        ListNode curr = head;
        ListNode after_curr = head.next;
        ListNode before_curr = null;
        while (curr != null) {
            after_curr = curr.next;   
            curr.next = before_curr;  
            before_curr = curr;
            curr = after_curr;
        }
        return before_curr;
    }
}