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
    public ListNode oddEvenList(ListNode head) {
    ListNode even=new ListNode(0);
    ListNode odd=new ListNode(0);
    ListNode i=even;ListNode j=odd;
    ListNode temp=head;
    boolean flag=true;
    while(temp!=null){
        if(flag){
            j.next=temp;
            j=j.next;
            flag=false;
        }
        else{
            i.next=temp;
            i=i.next;
            flag=true;
        }
        temp=temp.next;
    }
    i.next=null;j.next=null;
    j.next=even.next;
    return odd.next;    
    }
}