package com.company.ds.model;

import com.company.model.SinglyListNode;
import com.company.utils.SinglyListUtils;

public class SinglyList {

    SinglyListNode node;

    public SinglyList(SinglyListNode node) {
        this.node = node;
    }

    public static SinglyList of(int...values) {
        SinglyListNode node = SinglyListUtils.toLinkedList(values);
        return new SinglyList(node);
    }

    public void add(int value) {
        SinglyListUtils.addTail(node, value);
    }

    public void delete(int value) {
        node = SinglyListUtils.deleteByKey(node, value);
    }

    public void traverse() {
        SinglyListUtils.printList(node);
    }

}
