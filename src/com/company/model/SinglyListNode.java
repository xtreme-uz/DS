package com.company.model;

public class SinglyListNode {

    public int value;
    public SinglyListNode next;

    public SinglyListNode() {
    }

    public SinglyListNode(int value) {
        this.value = value;
    }

    public SinglyListNode(int value, SinglyListNode next) {
        this.value = value;
        this.next = next;
    }
}
