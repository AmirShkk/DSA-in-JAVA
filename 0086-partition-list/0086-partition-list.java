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
    public ListNode partition(ListNode head, int x) {
    if(head==null || head.next==null) return head;
    ListNode dummynode1=new ListNode(0);
    ListNode dummynode2=new ListNode(0);
    ListNode i=dummynode1;
    ListNode j=dummynode2;
    ListNode temp=head;
    while(temp!=null){
        if(temp.val<x){
            i.next=temp;
            i=i.next;
        }
        else{
            j.next=temp;
            j=j.next;
        }
        temp=temp.next;
    } 
    i.next=null;
    j.next=null;
    i.next=dummynode2.next;
    return dummynode1.next;
    }
}