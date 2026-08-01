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
// class Solution {
    // public ListNode reverse(ListNode head,ListNode end){
    //     if(head==end){
    //        head.next=null;
    //        return head;
    //     }
    //     ListNode a=head.next;
    //     ListNode b=reverse(a,end);
    //     a.next=head;
    //     head.next=null;
    //     return b;
    // }
    // public ListNode reverseBetween(ListNode head, int left, int right) {
    // ListNode reverse=new ListNode(0);
    // ListNode temp=reverse;    
    // temp.next=head;
    // if(head.next==null || right==left) return head;
    // int i=1;int j=1;
    // ListNode leftNode=head;ListNode rightNode=head;
    // while(i<left || j<right){
    //     if(i<left){
    //        leftNode=leftNode.next;
    //        i++;
    //     }
    //     if(j<right){
    //         rightNode=rightNode.next;
    //         j++;
    //     }
    // }   
    // ListNode endList=rightNode.next; 
    // while(temp.next!=leftNode){
    //     temp=temp.next;
    // }    
    // temp.next=reverse(leftNode,rightNode);
    // while(temp.next!=null){
    //     temp=temp.next;
    // }    
    // temp.next=endList;
    // return reverse.next;
    // }
 class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {   
    if(head.next==null) return head;
    ListNode dummynode=new ListNode(0);
    dummynode.next=head;
    ListNode temp=dummynode;
    ListNode curr=head;
    for(int i=0;i<left-1;i++){
        curr=curr.next;
        temp=temp.next;
    }
   
    ListNode b=curr;
    ListNode prev=null;
    for(int i=0;i<=(right-left);i++){
        ListNode forward=curr.next;
        curr.next=prev;
        prev=curr;
        curr=forward;
          }      
    temp.next=prev;
    b.next=curr;
    return dummynode.next;
}
 }
