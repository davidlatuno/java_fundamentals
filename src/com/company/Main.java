package com.company;

public class Main {

    class LinkedList {
        Node head; // head of list
//        Linked list Node. This inner class is made static so that main() can access it
        static class Node {
            int data;
            Node next;
            Node (int d) {data = d; next=null;} // Constructor
}

    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("hi");
    }
}
