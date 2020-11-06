package com.company;

import com.company.ds.model.BinaryTree;
import com.company.ds.model.DoublyList;
import com.company.ds.model.SinglyList;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nBinary Tree");
        BinaryTree tree = BinaryTree.of(45, 24, 81, 12, 26, 70, 100);
        tree.add(31);
        tree.delete(81);
        tree.traverse();

        System.out.println("\nSingly Linked List");
        SinglyList singlyList = SinglyList.of(1, 2, 3, 4, 5, 6, 7);
        singlyList.add(8);
        singlyList.delete(1);
        singlyList.traverse();

        System.out.println("\nDoubly Linked List");
        DoublyList doublyList = DoublyList.of(1, 2, 3, 4, 5, 6, 7);
        doublyList.add(8);
        doublyList.delete(8);
        doublyList.traverse();
    }
}
