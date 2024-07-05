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
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        // If the linked list has fewer than 3 nodes, return [-1, -1]
        if (head == null || head.next == null || head.next.next == null) {
            return new int[] {-1, -1};
        }

        int firstCriticalPoint = -1;
        int lastCriticalPoint = -1;
        int minDistance = Integer.MAX_VALUE;
        int index = 0;
        int prevIndex = -1;

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = curr.next;

        while (next != null) {
            index++;

            // Check if current node is a critical point
            if ((curr.val > prev.val && curr.val > next.val) || (curr.val < prev.val && curr.val < next.val)) {
                if (firstCriticalPoint == -1) {
                    firstCriticalPoint = index;
                } else {
                    minDistance = Math.min(minDistance, index - prevIndex);
                }
                lastCriticalPoint = index;
                prevIndex = index;
            }

            prev = curr;
            curr = next;
            next = next.next;
        }

        if (firstCriticalPoint == lastCriticalPoint) {
            return new int[] {-1, -1};
        }

        int maxDistance = lastCriticalPoint - firstCriticalPoint;

        return new int[] {minDistance, maxDistance};
    }
}