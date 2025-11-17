package main.java.com.leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MergeTwoLists {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        ListNode firstCurrent = list1;
        ListNode secondCurrent = list2;

        while (firstCurrent != null && secondCurrent != null) {
            if (firstCurrent.val < secondCurrent.val) {
                tail.next = new ListNode(firstCurrent.val);
                firstCurrent = firstCurrent.next;
            } else {
                tail.next = new ListNode(secondCurrent.val);
                secondCurrent = secondCurrent.next;
            }
            tail = tail.next;
        }

        while (firstCurrent != null) {
            tail.next = new ListNode(firstCurrent.val);
            firstCurrent = firstCurrent.next;
            tail = tail.next;
        }

        while (secondCurrent != null) {
            tail.next = new ListNode(secondCurrent.val);
            secondCurrent = secondCurrent.next;
            tail = tail.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

    }
}
