package io.github.supermaskv.class03;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author supermaskv
 * <p>
 * 用队列实现栈
 */
public class Q07 {
    private static class MyStack{
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();



        public void push(int n) {
            Queue<Integer> pushQueue = queue.isEmpty() ? queue2 : queue;
            pushQueue.add(n);
        }

        public int pop() {
            Queue<Integer> pushQueue = queue.isEmpty() ? queue2 : queue;
            Queue<Integer> popQueue = queue.isEmpty() ? queue : queue2;

            if (pushQueue.isEmpty()) {
                throw new RuntimeException("Stack is empty.");
            }

            while (pushQueue.size() > 1) popQueue.add(pushQueue.poll());

            return pushQueue.poll();
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.pop());
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        myStack.push(5);
        System.out.println(myStack.pop());
    }
}
