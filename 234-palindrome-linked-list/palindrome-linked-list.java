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
    public boolean isPalindrome(ListNode head) {
        ListNode middle_node = middleNode(head);
        ListNode reverse_head = reverseList(middle_node);

        ListNode t1 = head;
        ListNode t2 = reverse_head;
        while(t2 != null)
        {
            if(t1.val == t2.val)
            {
                t1 = t1.next;
                t2 = t2.next;
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
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