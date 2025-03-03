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
        
        ListNode num1 = l1;
        ListNode num2 = l2;
        
        
        
         // Find the length of both the linked lists
        int len1 = countNodes(num1);
        int len2 = countNodes(num2);
        
        // If num1 is smaller, swap the two linked lists by
        // calling the function with reversed parameters
        if (len1 < len2) {
            return addTwoNumbers(num2, num1);
        }
        
        
        ListNode res = num1; //kyuki rnum1 is longer
        
        ListNode d1 = num1 , d2 = num2; // d represents digit
        int carry =0;
        
        while(d2 != null || carry!= 0)
        {
            // Add carry to d1
            d1.val += carry;
            
            if(d2!=null)   // If d2 is not empty, add it to d1
            {
                d1.val += d2.val;
                d2 = d2.next;
            }

         // Store the carry for the next nodes
        carry = d1.val / 10;
        
        // Store the remainder in num1
        d1.val = d1.val % 10;
        
        // If we are at the last node of d1 but carry is
        // still left, then add a new node to d1
        if (d1.next == null && carry != 0) 
        {
            d1.next = new ListNode(0);
        }
        d1 = d1.next;        
        }
        
        // Reverse the resultant linked list to get the
        // required linked list
        return res;
    }
    static ListNode reverseLL(ListNode head)
    {
        ListNode curr = head;
        ListNode after_curr = head.next;
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
    
    
    
    
    
    
    
    
    static int countNodes(ListNode head) 
    {
        int len = 0;
        ListNode curr = head;

        while (curr != null) {
            len += 1;
            curr = curr.next;
        }
        return len;
    }






    static ListNode trimLeadingZeros(ListNode head)
    {
        while (head != null && head.val == 0) {
            head = head.next;
        }
        return head;
}
}