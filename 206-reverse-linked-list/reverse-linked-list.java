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
    public ListNode reverseList(ListNode head) {
        if(head ==null || head.next == null) return head;

        ListNode curr = head;
        ListNode after_curr = head.next;
        ListNode before_curr = null;
        
       
        
        
         while (curr != null) {
            after_curr = curr.next;  // Save the next node 
            curr.next = before_curr;  // Reverse the current node's pointer
            
            // Move pointers one step forward
            before_curr = curr;
            curr = after_curr;
        }
        
        // At the end, before_curr will be the new head of the reversed list
        return before_curr;
    }
}