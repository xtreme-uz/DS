package com.company.utils;

import com.company.model.SinglyListNode;

public class SinglyListUtils {

    public static SinglyListNode addHead(SinglyListNode head, int value) {
        SinglyListNode newNode = new SinglyListNode(value, head);
        return newNode;
    }

    public static SinglyListNode addTail(SinglyListNode head, int value) {
        if (head == null)
            return new SinglyListNode(value);

        if (head.next == null) {
            head.next = new SinglyListNode(value);
        } else {
            addTail(head.next, value);
        }
        return head;
    }

    public static SinglyListNode deleteByKey(SinglyListNode head, int value) {
        SinglyListNode current = head, previous = null;

        if (current != null && current.value == value) {
            head = current.next;
            return head;
        }

        while (current != null && current.value != value) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next;
        }

        return head;
    }

    public static SinglyListNode toLinkedList(int... values) {
        SinglyListNode head = null;
        for (int value : values) {
            head = addTail(head, value);
        }
        return head;
    }

    public static void printList(SinglyListNode root) {
        while (root != null) {
            System.out.print(root.value + ((root.next == null)?"":" -> "));
            root = root.next;
        }
    }

}
