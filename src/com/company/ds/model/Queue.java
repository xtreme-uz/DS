package com.company.ds.model;

public class Queue {

    public int size;
    int[] queue;
    int head, tail;
    int count;

    public Queue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.count = 0;
        head = -1;
        tail = -1;
    }

    public void add(int value) {
        if (count < size) {
            queue[++tail] = value;
            count++;
        } else {
            System.out.println("Queue is full");
        }
    }

    public int get() {
        if (count > 0){
            int value = queue[0];
            for (int i = 0; i < count-1 ; i++) {
                queue[i] = queue[i+1];
            }
            tail--;
            count--;
            return value;
        } else {
            System.out.println("Queue is empty");
            return 0;
        }
    }
}
