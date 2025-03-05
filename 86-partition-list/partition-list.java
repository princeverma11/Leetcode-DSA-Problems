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
 ///////////////////////////////////////////////////////////////////////////////
 //SEE THIS SAME QUES ON GFG .. ITS THE SAME QUESTION BUT ITS SLIGHTLY MORE INTRESTING .. YOU WILL LIKE IT
///////////////////////////

class Solution {
    public ListNode partition(ListNode head, int x) {
        
       ListNode small = new ListNode(-1);
       
       ListNode large = new ListNode(-1);
       
       
        ListNode sHead = small;
        ListNode sTail = small;
        
        ListNode lHead = large;
        ListNode lTail = large;
       
       
       
       ListNode temp = head;
       while (temp != null) {
            if (temp.val < x) {
                sTail.next = temp;
                sTail = sTail.next;
            }  
            else {
                lTail.next = temp;
                lTail = lTail.next;
            }
            temp = temp.next;
        }
       
       
       
       // Merge the three lists
        sTail.next =  lHead.next;
        lTail.next = null; // Important to avoid cycles
        // kyuki last k element m jo aayega uske next m ho sakta h  koi element ho 
        
        return sHead.next;
       
    }
}