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
        
       
        
        while(curr!=null)
        {
            curr.next = before_curr;
            
            before_curr = curr;
            curr = after_curr;
            if(after_curr!=null) // If `after_curr` is not null, move it to the next node in the original list
            {
                after_curr = after_curr.next;
            }else{curr = null;} // If `after_curr` is null, set `curr` to null to exit the loop
            
            
        }
        return before_curr;
    }
}