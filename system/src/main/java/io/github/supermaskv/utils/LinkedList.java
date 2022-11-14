package io.github.supermaskv.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author supermaskv
 * <p>
 * 单向链表测试相关工具
 */
public class LinkedList {
    public static class ListNode {
        public int val;
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
        ListNode cur = head;
        for (int i = 0; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
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

    public static void main(String[] args) {
        print(generate(new int[]{1, 2, 3, 4, 4}));
    }
}
