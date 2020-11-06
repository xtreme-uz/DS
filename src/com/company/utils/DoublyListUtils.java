package com.company.utils;

import com.company.model.DoublyListNode;

public class DoublyListUtils {

    public static DoublyListNode addHead(DoublyListNode head, int value) {
        DoublyListNode newNode = new DoublyListNode(value);
        head.previous = newNode;
        newNode.next = head;
        return newNode;
    }

    public static DoublyListNode addTail(DoublyListNode head, int value) {
        if (head == null)
            return new DoublyListNode(value);

        if (head.next == null) {
            DoublyListNode newNode = new DoublyListNode(value);
            newNode.previous = head;
            head.next = newNode;
        } else {
            addTail(head.next, value);
        }
        return head;
    }

    public static DoublyListNode deleteByKey(DoublyListNode head, int value) {
        DoublyListNode current = head;

        if (current != null && current.value == value) {
            current.next.previous = null;
            return current.next;
        }

        while (current != null && current.value != value) {
            current = current.next;
        }

        if (current != null) {
            if (current.next != null)
                current.next.previous = current.previous;

            current.previous.next = current.next;
        }

        return head;
    }

    public static DoublyListNode toLinkedList(int...values) {
        DoublyListNode head = null;
        for (int value : values) {
            head = addTail(head, value);
        }
        return head;
    }

    public static void printList(DoublyListNode root) {
        while (root != null) {
            System.out.print(((root.previous == null)?"":" <- ") + root.value + ((root.next == null)?"":" -> "));
            root = root.next;
        }
    }

}
