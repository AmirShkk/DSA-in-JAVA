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
    public ListNode swapNodes(ListNode head, int k) {
       if(head.next==null) return head;
       int copyofk=k;
       int size=0;
       ListNode slow=head;
       ListNode fast=head;
       slow=head;
       while(copyofk!=1){
        fast=fast.next;
        copyofk--;
       }
       ListNode tempNode=fast;
       while(fast.next!=null){
        fast=fast.next;
        slow=slow.next;
       }

       int temp=slow.val;
       slow.val=tempNode.val;
       tempNode.val=temp;
       return head;
    }
}