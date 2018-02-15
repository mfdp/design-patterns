package com.example.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest  {

    @Test
    public void testCreateQueue() {
        Queue queue = new Queue();
        assertNotNull(queue);
    }

    @Test
    public void testCreateTenSizeQueue() {
        Queue queue = new Queue(10);
        assertNotNull(queue);
    }

    @Test
    public void testAdd() {
        Object element = new Object();
        Queue queue = new Queue();
        boolean result = queue.add(element);
        assertTrue(result);
    }

    @Test
    public void testAddWrongElement() {
        Queue queue = new Queue();
        assertThrows(IllegalStateException.class, () -> queue.add(null));
    }

    @Test
    public void testAddANdPeek() {
        Queue queue = new Queue();
        Object elementToAdd = new Integer(5);
        queue.add(elementToAdd);
        Object peek = queue.peek();
        assertEquals(elementToAdd, peek);
    }

    @Test
    public void testAddAndPeekNotEquals() {
        Queue queue = new Queue();
        Object elementToAdd = new Integer(5);
        queue.add(elementToAdd);
        Object peek = queue.peek();
        assertNotEquals(new Object(), peek);
    }

    @Test
    void testPeekWithoutAdd() {
        Queue queue = new Queue();
        assertNull(queue.peek());
    }

    @Test
    void testPoolMethod() {
        Queue queue = new Queue();
        assertNull(queue.pool());
    }

    @Test
    void testPoolMethodAfterAdd() {
        Queue queue = new Queue();
        queue.add(new Integer(0));
        assertNotNull(queue.pool());
    }

    @Test
    void testPoolMethodAfterAddEquals() {
        Queue queue = new Queue();
        Object added = new Integer(5);
        queue.add(added);
        Object pool = queue.pool();
        assertEquals(added, pool);
    }

    @Test
    void testAddInreaseSize() {
        Queue queue = new Queue();
        queue.add(new Object());
        assertEquals(queue.size(), 1);
    }

    @Test
    void testAddAndPeek() {
        Queue queue = new Queue();
        queue.add(new Object());
        queue.peek();
        assertEquals(queue.size(), 1);
    }

    @Test
    void testAddAndPool() {
        Queue queue = new Queue();
        queue.add(new Object());
        queue.pool();
        assertEquals(queue.size(), 0);
    }

    @Test
    void testPeeklAfterAddFewElements() {
        Queue queue = new Queue();
        Object o = new Object();
        Object last = new Object();
        queue.add(o);
        queue.add(last);
        Object peek = queue.peek();
        assertEquals(o, peek);
    }

    @Test
    void testPoolAfterAddFewElements() {
        Queue queue = new Queue();
        Object o = new Object();
        Object last = new Object();
        queue.add(o);
        queue.add(last);
        Object pool = queue.pool();
        assertEquals(o, pool);
    }

    @Test
    void testPoolOversize() {
        Queue queue = new Queue(2);
        queue.add(new Object());
        queue.add(new Object());
        assertThrows(IllegalStateException.class, () -> queue.add(new Object()));
    }

    @Test
    void testSizeAfterAddFiveElements() {
        Queue queue = new Queue();
        queue.add(new Object());
        queue.add(new Object());
        queue.add(new Object());
        queue.add(new Object());
        queue.add(new Object());
        assertEquals(queue.size(), 5);
    }

}
