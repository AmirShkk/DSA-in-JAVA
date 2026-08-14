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
//     public ListNode reverse(ListNode head){
//        ListNode curr=head;
//        ListNode prev=null;
//        ListNode forward=null;
//     while(curr!=null){
//         forward=curr.next;
//         curr.next=prev;
//         prev=curr;
//         curr=forward;
//        }
//        return prev;
//     }  
//     public ListNode removeNodes(ListNode head) {
//     ListNode reversehead=reverse(head);    
//     ListNode i=new ListNode(0);
//     ListNode temp=i;
//     ListNode j=reversehead;
//     while(j!=null){
//         if(j.val<temp.val){} 
//         else {
//             System.out.println(j.val);
//             temp.next=j;
//             temp=temp.next;
//           }
//         j=j.next;
//     }
//     temp.next=null;
//     return reverse(i.next);
//   }
// }
// using stack
class Solution{
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            while(st.size()!=0 && temp.val>st.peek().val){
                st.pop();
            }
            st.push(temp);
            temp=temp.next;
        }
        while(st.size()>0){
          ListNode t=st.pop();
          t.next=temp;
          temp=t;
        }
      return temp;
    }
}