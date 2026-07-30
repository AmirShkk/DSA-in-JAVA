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
    public void reorderList(ListNode head) {
    if(head==null || head.next==null) return;
    ListNode fast=head;
    ListNode slow=head;
    while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }    
    fast=slow.next;
    slow.next=null;
    fast=recursion(fast);
    slow=head;
    ListNode i=slow;
    ListNode j=fast;
    ListNode dummynode=new ListNode(0);
    ListNode temp=dummynode;
    while(i!=null || j!=null){
       if(i!=null){
        temp.next=i;
        temp=temp.next;
        i=i.next;
       }
       if(j!=null){
        temp.next=j;
        temp=temp.next;
        j=j.next;
       }
    }
       
    }
}