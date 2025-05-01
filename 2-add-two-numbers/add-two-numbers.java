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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode ansHead = new ListNode();
        ListNode anstemp = null;

        ListNode l1temp = l1;
        ListNode l2temp = l2;
        int carry = 0;
        while(l1temp != null || l2temp != null || carry != 0)
        {
            int sum = carry;
            if(l1temp!=null)
            {
                sum += l1temp.val;
                l1temp = l1temp.next;
            }
            if(l2temp!=null)
            {
                sum += l2temp.val;
                l2temp = l2temp.next;
            }
            carry = sum/10;
            int digit = sum%10;

            ListNode digitNode = new ListNode(digit);
            if(anstemp == null)
            {
                ansHead = digitNode;
                anstemp = digitNode;
            }
            else
            {
                anstemp.next = digitNode;
                anstemp = digitNode;
            }
        }
        return ansHead;
    }

}