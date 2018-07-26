package com.company;

class LinkedList {
    Node head; // head of list
    //        Linked list Node. This inner class is made static so that main() can access it
    static class Node {
        int data;
        Node next;
        Node (int d) {data = d; next=null;} // Constructor
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println("");

    }

    public void push (int new_data) {
        /* 1 & 2: Allocate the node & put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public void insertAfter (Node prev_node, int new_data) {
        /* 1. Check if the given Node is null */
        if (prev_node == null) {
            System.out.println("The Given previous node cannot be null");
            return;
        }

        /* 2. Allocate the the node &
           3. Put in the data  */

        Node new_node = new Node(new_data);

        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;

        /* 5. Make next of prev_node as new_node */
        prev_node.next = new_node;
    }

    public static void main(String[] args) {
        // write your code here
        LinkedList list= new LinkedList();

        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head.next = second;

        second.next = third;

        list.printList();

        list.push(1);

        list.printList();
    }
}
