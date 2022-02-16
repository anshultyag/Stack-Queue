package com.company;
public class StackAndQueue {

    Node head;
    Node tail;
    Node top;

    public void push(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            Node tempNode = head;
            this.head = newnode;
            newnode.next = tempNode;
        }
        top=head;
    }


}