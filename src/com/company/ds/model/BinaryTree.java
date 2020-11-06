package com.company.ds.model;

import com.company.model.BinaryTreeNode;
import com.company.utils.BTUtils;

public class BinaryTree {

    BinaryTreeNode node;

    public BinaryTree(BinaryTreeNode node) {
        this.node = node;
    }

    public static BinaryTree of(int...values) {
        BinaryTreeNode root = BTUtils.toBinaryTree(values);
        return new BinaryTree(root);
    }

    public void add(int value) {
        node = BTUtils.add(node, value);
    }

    public void delete(int value) {
        node = BTUtils.deleteValue(node, value);
    }

    public void traverse() {
        BTUtils.traverseInOrder(node);
    }

}
