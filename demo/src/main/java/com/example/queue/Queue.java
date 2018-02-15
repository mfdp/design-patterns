package com.example.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Queue {

    private List<Object> queue = new ArrayList<>();
    private final int sizeOfQueue;
    private int lastIndex;

    public Queue() {
        this.sizeOfQueue = 5;
        this.queue = new ArrayList<>();
        this.lastIndex = 0;
    }

    public Queue(int size) {
        this.sizeOfQueue = size;
        this.queue = new ArrayList<>();
        this.lastIndex = 0;
    }

    public boolean add(Object o) {
        if (o == null || sizeOfQueue == lastIndex) {
            throw new IllegalStateException("Object cannot be null");
        }
        lastIndex++;
        queue.add(o);
        return true;
    }

    public Object peek() {
        if (lastIndex == 0) {
            return null;
        }
        return queue.get(0);
    }

    public Object pool() {
        if (lastIndex == 0) {
            return null;
        }
        lastIndex--;
        return queue.remove(0);
    }

    public int size() {
        return lastIndex;
    }
}
