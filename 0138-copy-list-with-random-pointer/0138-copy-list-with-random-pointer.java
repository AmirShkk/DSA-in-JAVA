/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
//using linkedlist
// class Solution {
//     public Node copyRandomList(Node head) {
//     //create a deap copy of a list
//     Node dummynode=new Node(0);
//     Node dummynodetemp=dummynode;
//     Node temp=head;
//     while(temp!=null){
//         Node t=new Node(temp.val);
//         dummynodetemp.next=t;
//         dummynodetemp=dummynodetemp.next;
//         temp=temp.next;
//     } 
//     dummynodetemp.next=null;
//     // step2:connect both ll alternstively
//     Node p1=head;
//     Node p2=dummynode.next;
//     Node p3=dummynode;
//     while(p1!=null){
//         p3.next=p1;
//         p3=p3.next;
//         p1=p1.next;
//         p3.next=p2;
//         p3=p3.next;
//         p2=p2.next;
//         }
//     //step3:assigning random pointer
//     temp=head;
//     while(temp!=null){
//         if(temp.random==null) temp.next.random=null;
//         else temp.next.random=temp.random.next;
//         temp=temp.next.next;
//     } 
//     dummynodetemp=dummynode;
//     temp=head;
//     //step4:disconnecting both linked list
//     while(temp!=null){
//         dummynodetemp.next=temp.next;
//         dummynodetemp=dummynodetemp.next;
//         temp.next=dummynodetemp.next;
//         temp=temp.next;
//     }
//     return dummynode.next;   
//     }
// }
class Solution{
    public Node copyRandomList(Node head){
    Node dummynode=new Node(0);
    Node tempofdummynode=dummynode;
    Node temp=head;
    HashMap<Node,Node> hm=new HashMap<>();
    while(temp!=null){
        Node t=new Node(temp.val);
        hm.put(temp,t);
        tempofdummynode.next=t;
        tempofdummynode=tempofdummynode.next;
        temp=temp.next;
    }
    tempofdummynode.next=null;
    temp=head;
    while(temp!=null){
        if(temp.random!=null) hm.get(temp).random=hm.get(temp.random);
        else hm.get(temp).random=null;
        temp=temp.next;
    }
    return dummynode.next;
    }

    }