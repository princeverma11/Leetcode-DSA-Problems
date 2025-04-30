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
if (head == null) return null;
        
        ListNode current = head;
        
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        
        return head;
        // if(head==null) return null;
        
        // ListNode newHead = null;
        // ListNode newLLtemp = null;
        // ListNode tempO = head; // traverse on original LL
        
        // while(tempO.next != null)
        // {
        //     if(tempO.next != null && tempO.next.val != tempO.val)
        //     {
        //         if(newHead == null)
        //         {
        //             newHead = tempO;
        //             newLLtemp = newHead;
        //         }
        //         else
        //         {
        //             newLLtemp.next = tempO;
        //             newLLtemp = tempO; // so that newLLtemp is always the Last Node of newLL   
        //         }
                
        //     }
        // tempO = tempO.next;
        // }
        // newLLtemp.next = tempO;
        // return newHead;
    }
}