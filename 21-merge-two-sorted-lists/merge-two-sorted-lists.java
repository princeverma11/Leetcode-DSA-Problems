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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(-101);
        ListNode ansTail = ans;
        ListNode anstemp = ans;

        ListNode list1temp = list1;
        ListNode list2temp = list2;

        while(list1temp != null && list2temp != null)
        {
            if(list1temp.val <= list2temp.val)
            {
                ListNode dummy = new ListNode(list1temp.val);
                ansTail.next = dummy;
                ansTail = dummy;
                list1temp = list1temp.next;
            }
            else
            {
                ListNode dummy = new ListNode(list2temp.val);
                ansTail.next = dummy;
                ansTail = dummy;
                list2temp = list2temp.next;
            }
        }
        if(list1temp!=null)
        {
            ansTail.next = list1temp;
        }
        if(list2temp!=null)
        {
            ansTail.next = list2temp;
        }

        return ans.next;



    }
}