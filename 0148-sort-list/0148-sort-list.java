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
    public ListNode mergesort(ListNode list1,ListNode list2){
        ListNode i=list1;
        ListNode j=list2;
        ListNode dummynode=new ListNode(0);
        ListNode temp=dummynode;
       if(list1==null && list2==null){
        return null;
    }
       else if(list1==null){
        temp.next=list2;
        return dummynode.next;
    }
        else if(list2==null){
        temp.next=list1;
        return dummynode.next;
    }
    // if(list1.val<=list2.val) dummynode.next=list1;
    // else dummynode.next=list2;
    while(i!=null && j!=null){
        if(i.val<=j.val){
            temp.next=i;
            temp=temp.next;
            i=i.next;
        }
        else{
            temp.next=j;
            temp=temp.next;
            j=j.next;
        }}
    if(i!=null) temp.next=i;
    else if(j!=null) temp.next=j;
    return dummynode.next;
    }
    public ListNode sortList(ListNode head) {
    if(head==null) return null;    
    if(head.next==null) return head;
    ListNode temp=head;
    ListNode slow=head;
    ListNode fast=head;
    while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    ListNode head1=slow.next;
    slow.next=null;
    ListNode left=sortList(head);
    ListNode right=sortList(head1);
    return mergesort(left,right);
  }
}