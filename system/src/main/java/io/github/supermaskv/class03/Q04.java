package io.github.supermaskv.class03;

/**
 * @author supermaskv
 * <p>
 * 使用双向链表实现队列
 */
public class Q04 {
    private static class Queue<E> {
        private static class ListNode<E> {
            E val;
            ListNode<E> pre;
            ListNode<E> next;

            public ListNode() {
            }

            public ListNode(E val) {
                this.val = val;
            }
        }

        private ListNode<E> head = null;
        private ListNode<E> tail = null;
        private int size = 0;


        public int size() {
            return size;
        }

        public void add(E e) {
            ListNode<E> node = new ListNode<>(e);
            if (this.size == 0) {
                this.head = node;
                this.tail = node;
                this.size = 1;
            } else {
                ListNode<E> pre = tail;
                tail.next = node;
                tail = tail.next;
                tail.pre = pre;
                this.size++;
            }
        }

        public E poll() {
            if (this.size == 0) {
                return null;
            } else if (this.size == 1) {
                ListNode<E> ans = head;
                this.head = null;
                this.tail = null;
                this.size = 0;
                return ans.val;
            } else {
                ListNode<E> ans = head;
                head = head.next;
                ans.pre = null;
                ans.next = null;
                head.pre = null;
                size--;
                return ans.val;
            }
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue.poll());
        queue.add(3);
        System.out.println(queue.poll());
        queue.add(4);
        System.out.println(queue.size());
    }
}
