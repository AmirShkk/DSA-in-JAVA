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
    public ListNode recursion(ListNode head){
     if(head.next==null) return head;
     ListNode a=head.next;
     ListNode b=recursion(a);
     a.next=head;
     head.next=null;
     return b;
    }
    public int pairSum(ListNode head) {
    int max=Integer.MIN_VALUE; 
    ListNode slow=head;
    ListNode fast=head;
    while(fast.next!=null && fast.next.next!=null){
        fast=fast.next.next;
        slow=slow.next;
    }    
    fast=slow.next;
    slow.next=null;
    ListNode rev=recursion(head);
    while(fast!=null){
        int sum=rev.val+fast.val;
        max=Math.max(sum,max);
        rev=rev.next;
        fast=fast.next;
    }
    return max;
    }
}