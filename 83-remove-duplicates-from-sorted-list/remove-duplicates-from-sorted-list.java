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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode orighead = head; 
        ListNode newhead = null;
        ListNode temp = head;
        
        while(orighead != null)
        {
            while(orighead.next != null && orighead.val == orighead.next.val)
            {
                orighead = orighead.next;
            }
            if (newhead == null) 
            {
                newhead = temp = orighead;
            }
            else{
                temp.next = orighead;
                temp = orighead;
            }
            orighead = orighead.next;
        }
        return newhead;
        }
        
    }
