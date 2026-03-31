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
        ListNode dummyN = new ListNode(-1); 
        ListNode temp1 = l1; 
        ListNode temp2 = l2; 
        ListNode dumTe=dummyN; 

        int carry =0; 
        while(temp1!=null || temp2!=null){
            int sum = carry; 
            if(temp1!=null){
                sum = sum+(temp1.val); 
            }
              if(temp2!=null){
                sum = sum+(temp2.val); 
            }
                carry = sum/10; 
                sum = sum%10; 

            ListNode newNode = new ListNode(sum);  
            dumTe.next = newNode; 
            dumTe = dumTe.next;

            if(temp1!=null){
            temp1=temp1.next; 

            }
            if(temp2!=null){
            temp2=temp2.next; 
            }   
        }
        if(carry!=0){
        ListNode newNode = new ListNode(carry);  
        dumTe.next = newNode; 
        }
    
        return dummyN.next; 
    }
}
