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
    public ListNode reverse(ListNode head){
        if(head.next==null) return head;
        ListNode a=head.next;
        ListNode b=reverse(a);
        a.next=head;
        head.next=null;
        return b;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode temp1=l1;ListNode temp2=l2;
    while(temp1!=null &&  temp2!=null){
        temp1=temp1.next;
        temp2=temp2.next;
    }   
    if(temp1==null && temp2!=null){
        return addTwoNumbers(l2,l1);
    } 
    ListNode dummynode=new ListNode(0);
    ListNode temp=dummynode;
    ListNode revL1=reverse(l1);
    ListNode revL2=reverse(l2);
    int carry=0;
    while(revL1!=null){
        int sum=0;
        if(revL2==null) {
            sum=carry+revL1.val;
        }
        else {
            sum=revL1.val+revL2.val+carry;
            revL2=revL2.next;
        }
        carry=sum/10;
        ListNode node=new ListNode(sum%10);
        temp.next=node;
        revL1=revL1.next;
        temp=temp.next;
    }
    if(carry!=0){
        ListNode node=new ListNode(carry);
        temp.next=node;
        temp=temp.next;
    }       
    temp.next=null;
    return reverse(dummynode.next); 
        }
    }    
    