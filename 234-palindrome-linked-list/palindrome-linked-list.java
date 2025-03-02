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
    public boolean isPalindrome(ListNode head) {
       ListNode middle = findMiddle(head);
       ListNode headOfReverse = reverseRightPart(middle);
       
       ListNode t1 = head;
       ListNode t2 = headOfReverse;
       while(t2!=null)
       {
           if(t1.val != t2.val)
           {
               return false;
           }
           t1 = t1.next;
           t2 = t2.next;
       }
       return true;

    }
    
    static ListNode findMiddle(ListNode head)
    {
         
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
      
    
    }
    static ListNode reverseRightPart(ListNode middle)
    {
        ListNode curr = middle;
        ListNode after_curr = middle.next;
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