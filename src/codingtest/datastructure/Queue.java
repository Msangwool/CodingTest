package codingtest.datastructure;

import java.util.LinkedList;

public class Queue {

    public static void main(String[] args) {

    }

    public class MyQueue<T> {
        private LinkedList<T> dequeue;

        public MyQueue() {
            dequeue = new LinkedList<>();
        }

        public void enqueue(T item) {
            dequeue.addLast(item);
        }

        public T dequeue() {
            return dequeue.pollFirst();
        }

        public boolean isEmpty() {
            return dequeue.isEmpty();
        }

        public int size() {
            return dequeue.size();
        }

        public T peek() {
            return dequeue.peekFirst();
        }
    }
}
