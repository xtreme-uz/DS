package com.company.ds.model;

import com.company.model.DoublyListNode;
import com.company.utils.DoublyListUtils;

public class DoublyList {

    DoublyListNode node;

    public DoublyList(DoublyListNode node) {
        this.node = node;
    }

    public static DoublyList of(int...values) {
        DoublyListNode node = DoublyListUtils.toLinkedList(values);
        return new DoublyList(node);
    }

    public void add(int value) {
        DoublyListUtils.addTail(node, value);
    }

    public void delete(int value) {
        node = DoublyListUtils.deleteByKey(node, value);
    }

    public void traverse() {
        DoublyListUtils.printList(node);
    }
}
