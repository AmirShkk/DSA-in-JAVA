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
    public ListNode swapPairs(ListNode head) {
    if(head==null || head.next==null) return head;
    ListNode temp=new ListNode(0);
    ListNode dummynode=new ListNode(0);
    ListNode j=dummynode;
    ListNode i=head;
    boolean flag=true;
    while(i!=null){
        if(flag){
            temp.next=i;
            flag=false;
             i=i.next;
        }
        else{
            j.next=i;
            i=i.next;
            j=j.next;
            j.next=temp.next;
            j=j.next;
            temp.next=null;
            flag=true;
        }
       
    }
     if(temp.next!=null){
       j.next=temp.next;
       j=j.next;
     }
    j.next=null;
     
    return dummynode.next;
    }
}