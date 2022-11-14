package io.github.supermaskv.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author supermaskv
 * <p>
 * 双向链表测试相关工具
 */
public class BiLinkedList {
    public static class ListNode {
        public int val;
        public ListNode pre;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode generate(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode();
        ListNode pre = null;
        ListNode cur = head;
        for (int i : arr) {
            cur.next = new ListNode(i);
            cur = cur.next;
            cur.pre = pre;
            pre = cur;
        }
        return head.next;
    }

    public static void print(ListNode head) {
        List<Integer> ans = new ArrayList<>();
        while (head != null) {
            ans.add(head.val);
            head = head.next;
        }
        System.out.println(ans);
    }

    public static void reversePrint(ListNode head) {
        ListNode cur = head;
        while (cur.next != null) cur = cur.next;

        List<Integer> ans = new ArrayList<>();
        while (cur != null) {
            ans.add(cur.val);
            cur = cur.pre;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        print(generate(new int[]{1, 2, 3, 4, 5}));
        reversePrint(generate(new int[]{1, 2, 3, 4, 5}));
    }
}
