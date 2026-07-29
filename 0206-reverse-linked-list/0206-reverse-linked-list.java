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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
    //  if(head==null || head.next==null) return head;
    //  ListNode curr=head;
    //  ListNode prev=null;
    //  ListNode forward=null;
    //  while(curr.next!=null){
    //     forward=curr.next;
    //     curr.next=prev;
    //     prev=curr;
    //     curr=forward;
    //     }
    // curr.next=prev;
    // return curr;
    return recursion(head);
    }
}