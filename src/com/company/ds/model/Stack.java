package com.company.ds.model;

public class Stack {

    public int size;
    int[] stack;
    int count;
    int top;

    public Stack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = size;
        this.count = 0;
    }

    public static Stack of(int...values) {
        Stack stack = new Stack(values.length);
        for (int value : values) {
            stack.push(value);
        }
        return stack;
    }

    public void push(int value) {
        if (count != size) {
            //++a, a++,
            //is not stack full
            if (top != 0) {
                stack[--top] = value;
                count++;
            }
        } else {
            System.out.println("Stack is full");
        }
    }

    public int pop() {
        if (count > 0) {
            count--;
            return stack[top++];
        } else {
            System.out.println("Stack is empty");
            return 0;
        }
    }

    public int peek() {
        if (count > 0) {
            return stack[top];
        } else {
            System.out.println("Stack is empty");
            return 0;
        }
    }

}
