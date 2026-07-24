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
    public ListNode rotateRight(ListNode head, int k) {
    if(head==null) return head;    
    ListNode slow=head;
    ListNode fast=head;
    ListNode Temp=head;
    int size=0;
    while(Temp!=null){
        Temp=Temp.next;
        size++;
    }
    if(k>=size){
        k=k%size;
    }
    ListNode dummynode=new ListNode(0);
    while(k!=0 && fast!=null){
        fast=fast.next;
        k--;
    }    
    while(fast!=null && fast.next!=null){
        fast=fast.next;
        slow=slow.next;
    }
    dummynode.next=slow.next;
    slow.next=null;
    ListNode temp=dummynode;
    while(temp.next!=null){
      temp=temp.next;
    }
    temp.next=head;
    return dummynode.next;
    }
}

// }
// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {
//         if (head == null || head.next == null) return head;

//         ListNode slow = head;
//         ListNode fast = head;
//         ListNode dummynode = new ListNode(0);

//         while (k != 0 && fast != null) {
//             fast = fast.next;
//             k--;
//         }

//         // handle k >= length: wrap around using remaining fast traversal
//         if (fast == null) {
//             // k was a multiple of length (or exactly length) -> no rotation
//             // (only correct if original k % length == 0; see note below)
//             return head;
//         }

//         while (fast != null && fast.next != null) {
//             fast = fast.next;
//             slow = slow.next;
//         }

//         dummynode.next = slow.next;
//         slow.next = null;
//         fast.next = head;   // <-- fixed: original tail connects to old head

//         return dummynode.next;
//     }
// }