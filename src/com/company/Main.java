package com.company;

import com.company.ds.model.Queue;

public class Main {

    public static void main(String[] args) {
//        System.out.println("\nBinary Tree");
//        BinaryTree tree = BinaryTree.of(45, 24, 81, 12, 26, 70, 100);
//        tree.add(31);
//        tree.delete(81);
//        tree.traverse();
//
//        System.out.println("\nSingly Linked List");
//        SinglyList singlyList = SinglyList.of(1, 2, 3, 4, 5, 6, 7);
//        singlyList.add(8);
//        singlyList.delete(1);
//        singlyList.traverse();
//
//        System.out.println("\nDoubly Linked List");
//        DoublyList doublyList = DoublyList.of(1, 2, 3, 4, 5, 6, 7);
//        doublyList.add(8);
//        doublyList.delete(8);
//        doublyList.traverse();

//        Stack stack = Stack.of(9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
//        System.out.println(stack.peek());


        //TODO of static function
        Queue queue = new Queue(3);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
        queue.add(12);
        System.out.println(queue.get());
        System.out.println(queue.get());

    }
}
