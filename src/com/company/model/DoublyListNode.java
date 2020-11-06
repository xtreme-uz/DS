package com.company.model;

public class DoublyListNode {

    public int value;
    public DoublyListNode previous;
    public DoublyListNode next;

    public DoublyListNode() {
    }

    public DoublyListNode(int value) {
        this.value = value;
    }

    public DoublyListNode(int value, DoublyListNode previous, DoublyListNode next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }
}
