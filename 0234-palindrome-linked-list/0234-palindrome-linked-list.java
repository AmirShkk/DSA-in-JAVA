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
    public boolean isPalindrome(ListNode head) {
    boolean flag=true;    
        // code here
    if(head==null || head.next==null) return true;
    ListNode fast=head;
    ListNode slow=head;
    while( fast.next!=null && fast.next.next!=null){
        fast=fast.next.next;
        slow=slow.next;
    }
    if(fast.next==null) flag=false;
    fast=slow.next;
    slow.next=null;
    slow=recursion(head);
    if(!flag) slow=slow.next;   
    while(fast!=null){
        if(fast.val!=slow.val){
        return false;}
        fast=fast.next;
        slow=slow.next;
    }
    return true;
}}