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
    public ListNode mergeKLists(ListNode[] lists) {
    if(lists.length==0) return null;    
    ListNode dummynode=new ListNode(0);ListNode temp=dummynode;
    int i=lists.length-1;
    while(i>=0){
        int j=0;
        int min=Integer.MAX_VALUE;
        ListNode pointer=null;
        int index=0;
        while(j<lists.length){
            if(lists[j]!=null && min>=lists[j].val){
              min=lists[j].val;
              pointer=lists[j];
              index=j;
          
            }
            j++;
        }
        if(min!=Integer.MAX_VALUE){
        temp.next=pointer;
        temp=temp.next;
        lists[index]=lists[index].next;
        if(lists[index]==null){
            i--;
        }
    }
      else{
        break;
      }
    }
    temp.next=null;
    return dummynode.next;
    // public ListNode mergesort(ListNode head1,ListNode head2){
    // ListNode i=head1;ListNode j=head2;
    // ListNode dummynode=new ListNode(0);ListNode temp=dummynode;
    // while(i!=null && j!=null){
    //     if(i.val<=j.val){
    //         temp.next=i;
    //         temp=temp.next;
    //         i=i.next;
    //     }
    //     else{
    //         temp.next=j;
    //         temp=temp.next;
    //         j=j.next;
    //     }
    // }
    //     while(i!=null){
    //         temp.next=i;
    //         temp=temp.next;
    //         i=i.next;
    //     }
    //     while(j!=null){
    //         temp.next=j;
    //         temp=temp.next;
    //         j=j.next;
    //     }
    //     return dummynode.next;
    // }
    // public ListNode mergeKLists(ListNode[] lists) {
    // if(lists.length==0) return null;
    // if(lists.length==1) return lists[0];
    // int i=0;
    // while(i<(lists.length-1)){
    //     lists[i+1]=mergesort(lists[i],lists[i+1]);
    //     i++;
    // }
    // return lists[i];
    }
}