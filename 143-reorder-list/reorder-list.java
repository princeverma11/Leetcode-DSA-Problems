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
///////////////////////////////////////////////////////////////////////
// ignore gfg explanation because it solves by O(nsquare)
// anuj ignores even length LL
///////////////////////////////////////////////////////////////////////
class Solution {
    public void reorderList(ListNode head) {
     
        ListNode middle = findMiddle(head);
        
        ListNode revLLhead = reverseLL(middle.next);
        middle.next = null; // Split the list into two halves
        ListNode t1 = head;
        ListNode t2 = revLLhead;
       
       while( t2 != null)
       {
           ListNode temp_nextoft1 = t1.next;
           ListNode temp_nextoft2 = t2.next;
           t1.next = t2;
           t2.next = temp_nextoft1;
           
           t1 = temp_nextoft1;
           t2 = temp_nextoft2;
           
           
       }
       
    }
    
    
    static ListNode findMiddle(ListNode head)
    {
          ListNode slow = head ;
          ListNode fast = head;
    
          while(fast != null && fast.next != null)
          {
             slow = slow.next;
              fast = fast.next.next;
          }
           return slow;   
    }
    static ListNode reverseLL(ListNode head)
    {
        if(head ==null || head.next == null) return head;
        ListNode beforecurr = null;
        ListNode curr = head;
        ListNode aftercurr;
        
        while(curr!=null)
        {
            aftercurr = curr.next;//yaha ac aage bd raha h
            
            curr.next = beforecurr;
            
            //moving forward
            beforecurr = curr;
            curr = aftercurr;
            
        }
        return beforecurr;
    }
}