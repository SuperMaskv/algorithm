package io.github.supermaskv.class03;

import java.util.Stack;

/**
 * @author supermaskv
 * <p>
 * 使用栈实现队列
 */
public class Q06 {
    private static class MyQueue {
        private Stack<Integer> pushStack = new Stack<>();
        private Stack<Integer> popStack = new Stack<>();

        private void pushToPop() {
            if (popStack.isEmpty()) {
                while (!pushStack.isEmpty()) {
                    popStack.push(pushStack.pop());
                }
            }
        }

        public void offer(int n) {
            pushStack.push(n);
            pushToPop();
        }

        public int poll() {
            if (pushStack.isEmpty() && popStack.isEmpty()) throw new RuntimeException("Queue is empty.");
            pushToPop();
            return popStack.pop();
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.offer(1);
        System.out.println(queue.poll());
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        queue.offer(4);
        System.out.println(queue.poll());
    }
}
