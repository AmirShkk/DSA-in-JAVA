
class Solution {
    public Node recursion(Node head){
    // if(head==null) return head;    
    Node curr=head;
    while(curr!=null) {
        if(curr.child==null) curr=curr.next;
        else{
        Node forward=curr.next;
        Node pointer=recursion(curr.child);
        curr.child=null;
        curr.next=pointer;
        pointer.prev=curr;
        while(curr.next!=null) curr=curr.next;
        curr.next=forward;
        if(forward!=null) forward.prev=curr;
        curr=curr.next;
        }
    }
    return head;
    }
    public Node flatten(Node head) {
    return recursion(head);  
    }
}