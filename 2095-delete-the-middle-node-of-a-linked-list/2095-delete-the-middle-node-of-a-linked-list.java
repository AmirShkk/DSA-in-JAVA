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
    public ListNode deleteMiddle(ListNode head) {
     ListNode temp=head;
     int size=0;
     while(temp!=null){
        size++;
        temp=temp.next;
     } 
     temp=head;
     if(size==1) head=null;
     size/=2;  
     while(temp!=null){
        if(size==1){
          temp.next=temp.next.next;
        }
        size--;
        temp=temp.next;
     }
     return head;
    }
}