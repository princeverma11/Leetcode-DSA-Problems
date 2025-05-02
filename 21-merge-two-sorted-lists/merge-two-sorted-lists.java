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
        ListNode dummy = new ListNode(-101);
        ListNode dummyTail = dummy;

        ListNode list1temp = list1;
        ListNode list2temp = list2;

        while(list1temp != null && list2temp != null)
        {
            if(list1temp.val <= list2temp.val)
            {
                dummyTail.next = list1temp;
                dummyTail = list1temp;
                list1temp = list1temp.next;
            }
            else
            {
                dummyTail.next = list2temp;
                dummyTail = list2temp;
                list2temp = list2temp.next;
            }
        }
        if(list1temp!=null)
        {
            dummyTail.next = list1temp;
        }
        if(list2temp!=null)
        {
            dummyTail.next = list2temp;
        }

        return dummy.next;
    }
}