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
    }
}
