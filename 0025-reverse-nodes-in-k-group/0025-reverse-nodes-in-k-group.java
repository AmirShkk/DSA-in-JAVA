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
    public ListNode reverse(ListNode start,ListNode end){
    if(start==end) return end;
    ListNode t=start.next;
    ListNode rev=reverse(start.next,end);
    t.next=start;
    return rev;
}
    public ListNode reverseKGroup(ListNode head, int k) {
    int n=1;
    ListNode temp=head;
    ListNode start=head;
    ListNode dummynode=new ListNode(0);
    ListNode tempofdummynode=dummynode;
    while(temp!=null){
        if(n%k==0){
            ListNode t=temp.next;
            ListNode rev=reverse(start,temp);
            tempofdummynode.next=rev;
            tempofdummynode=start;
            start.next=t;
            temp=start;
            start=temp.next; 
            }
        n++;
        temp=temp.next;    
    }
    return dummynode.next; 
  }
}