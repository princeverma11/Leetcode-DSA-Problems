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
        ListNode bc = null;
        ListNode curr = head;
        ListNode ac = null;;

        while(curr!=null)
        {
            ac = curr.next;

            curr.next = bc; // one arrow reversed

            bc = curr;
            curr = ac;
 
        }
        return bc;

    }
}