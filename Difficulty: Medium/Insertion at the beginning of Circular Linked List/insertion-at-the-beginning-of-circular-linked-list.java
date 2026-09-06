/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtBeginning(Node tail, int key) {
        // code here
        Node n=new Node(key);
        Node temp=tail.next;
        tail.next=n;
        tail.next.next=temp;
        return tail;
    }
}