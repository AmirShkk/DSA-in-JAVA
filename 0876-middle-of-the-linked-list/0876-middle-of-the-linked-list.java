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
    public ListNode middleNode(ListNode head) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        size/=2;
        // if(size%2!=0) size=size/2+1;
        // else size=(size/2);
        while(true){
          if(size==0){
            break;
          }
          size--;
          temp=temp.next;
        }  

    return temp;
    }
}