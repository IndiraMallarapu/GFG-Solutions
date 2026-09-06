/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node n=new Node(data);
        if(head==null){
            n.next=n;
            return n;
        }
        Node temp=head;
        if(temp.data>=data){
            n.next=temp;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=n;
            return n;
        }
        while(temp.next!=head&&temp.next.data<data){
            temp=temp.next;
        }
        if(temp.next==head){
            temp.next=n;
            n.next=head;
            return head;
        }
        n.next=temp.next;
        temp.next=n;
        return head;
    }
}