package ru.geekbrains.lesson2.homework_2;


public class LinkedList {
    Node head;

    public class Node {
        int value;
        Node next;
    }

    public void add(int value) {
        Node newNode = new Node();

        newNode.value = value;

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void reverse() {
        if (head != null && head.next != null){
            Node tmp = head;
            reverse(head.next, head);
            tmp.next = null;
        }
    }

    private void reverse(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;

        } else {
            reverse(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;


    }

}
