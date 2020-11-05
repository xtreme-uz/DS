package com.company.utils;

import com.company.model.BinaryTreeNode;

public class BTUtils {

    public static BinaryTreeNode toBinaryTree(int...nums) {
        BinaryTreeNode root = new BinaryTreeNode();
        for (int num : nums) {
            add(root, num);
        }
        return root;
    }

    public static BinaryTreeNode add(BinaryTreeNode root, int value) {
        if (root == null)
            return new BinaryTreeNode();

        if (value < root.value) {
            root.left = add(root.left, value);
        } else if (value > root.value) {
            root.right = add(root.right, value);
        }

        return root;
    }

    public static boolean has(BinaryTreeNode root, int value) {
        if (root == null)
            return false;

        if (value == root.value)
            return true;

        return value < root.value ? has(root.left, value) : has(root.right, value);
    }

    public static void delete(BinaryTreeNode root, int value) {
        root = deleteValue(root, value);
    }

    private static int findSmallestValue(BinaryTreeNode root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    //Depth-First Search
    //types InOrder, PreOrder, PostOrder
    public void traverseInOrder(BinaryTreeNode root) {
        if (root != null) {
            traverseInOrder(root.left);
            System.out.print(" " + root.value);
            traverseInOrder(root.right);
        }
    }

    //Breadth-First Search
    //TODO we need to learn queue

    private static BinaryTreeNode deleteValue(BinaryTreeNode root, int value) {
        if (root == null) {
            return null;
        }

        if (value == root.value) {
            if (root.left == null && root.right == null)
                return null;

            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            int smallest = findSmallestValue(root.right);
            root.value = smallest;
            root.right = deleteValue(root.right, smallest);
            return root;
        }

        if (value < root.value) {
            root.left = deleteValue(root.left, value);
            return root;
        } else {
            root.right = deleteValue(root.right, value);
            return root;
        }
    }

}
