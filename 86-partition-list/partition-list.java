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
    public ListNode partition(ListNode head, int x) {
        if(head== null || head.next == null)return head;
        ListNode smallHead = new ListNode(-101);
        ListNode smallTail = smallHead;

        ListNode bigHead = new ListNode(-101);
        ListNode bigTail = bigHead;

        ListNode temp = head;
        while(temp != null)
        {
            if(temp.val < x) {
                smallTail.next = new ListNode(temp.val);
                smallTail = smallTail.next;
            } else {
                bigTail.next = new ListNode(temp.val);
                bigTail = bigTail.next;
            }
            temp = temp.next;  // Move to next node (MISSING IN YOUR CODE)
        }
        smallTail.next = bigHead.next;  // Connect small list to big list
        return smallHead.next;           // Return the merged list
    }
    
}