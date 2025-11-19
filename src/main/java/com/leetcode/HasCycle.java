package main.java.com.leetcode;

import java.util.HashSet;

public class HasCycle {
    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode current = head;
        HashSet<ListNode> visited = new HashSet<>();

        while (current != null) {
            if (visited.contains(current)) {
                return true;
            }
            visited.add(current);
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
