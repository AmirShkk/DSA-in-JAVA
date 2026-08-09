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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
    int [] arr=new int[2];    
    if(head==null && head.next==null && head.next.next==null) return arr;
    ListNode temp=head;
    int prevval=head.val;
    int min=Integer.MAX_VALUE;
    int index=-1;
    int firstpoint=0;
    int count=0;
    while(temp.next!=null){
     if((temp.val>prevval && temp.val>temp.next.val) || (temp.val<prevval && temp.val<temp.next.val)){
       if(index==-1) firstpoint=count;
       else{
        if(count-index<min) min=count-index;
        }
        index=count;
    }
    prevval=temp.val;
    count++;
    temp=temp.next;
    }
    arr[0]=(min!=Integer.MAX_VALUE)?min:-1;
    arr[1]=(index-firstpoint>0)?(index-firstpoint):-1;
    return arr;    
        }
}