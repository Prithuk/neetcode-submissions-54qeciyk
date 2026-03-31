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
        while(l1!=null || l2!=null){
            int sum = carry; 
            if(l1!=null){
                sum = sum+(l1.val); 
            }
              if(l2!=null){
                sum = sum+(l2.val); 
            }
                carry = sum/10; 
                sum = sum%10; 

            ListNode newNode = new ListNode(sum);  
            dumTe.next = newNode; 
            dumTe = dumTe.next;

            if(l1!=null){
            l1=l1.next; 

            }
            if(l2!=null){
            l2=l2.next; 
            }   
        }
        if(carry!=0){
        ListNode newNode = new ListNode(carry);  
        dumTe.next = newNode; 
        }
    
        return dummyN.next; 
    }
}
