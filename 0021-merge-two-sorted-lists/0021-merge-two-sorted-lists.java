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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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
        }

    }
    if(i!=null) temp.next=i;
    else if(j!=null) temp.next=j;
    return dummynode.next;
    }
}