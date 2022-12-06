package io.github.supermaskv.class03;

import java.util.Stack;

/**
 * @author supermaskv
 *
 * O(1) 实现push, pop, getMin
 */
public class Q05 {
    private static class MyStack {
        private Stack<Integer> dataStack = new Stack<>();
        private Stack<Integer> minStack = new Stack<>();

        public void push(int n) {
            if (minStack.isEmpty()) {
                minStack.push(n);
            } else if (n < minStack.peek()) {
                minStack.push(n);
            }
            dataStack.push(n);
        }

        public int pop() {
            if (dataStack.isEmpty()) {
                throw new RuntimeException("Stack is empty.");
            }
            int pop = dataStack.pop();
            if (minStack.peek() == pop) {
                minStack.pop();
            }
            return pop;
        }

        public int getMin() {
            if (dataStack.isEmpty()) {
                throw new RuntimeException("Stack is empty.");
            }
            return minStack.peek();
        }
    }


    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(4);
        System.out.println(stack.getMin());
        stack.pop();
        stack.pop();
        System.out.println(stack.getMin());
    }
}
