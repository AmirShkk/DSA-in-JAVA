/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1=0;int size2=0;int t1;
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null){
            size1++;
            tempA=tempA.next;
        }
        
        while(tempB!=null){
            size2++;
            tempB=tempB.next;
        }
        tempA=headA;
        tempB=headB;
        if(size1>size2){
            t1=size1-size2;
            while(t1!=0){
              tempA=tempA.next;
              t1--;
            }
        }
        else{
            t1=size2-size1;
            while(t1!=0){
              tempB=tempB.next;
              t1--;
            }

        }
        while(tempA!=null){
          if(tempA==tempB){
            return tempA;
          }
          tempA=tempA.next;
          tempB=tempB.next;
        }
        return null;
    }
}