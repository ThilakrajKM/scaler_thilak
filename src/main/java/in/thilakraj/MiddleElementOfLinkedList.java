package in.thilakraj;

/**
 * Problem Description
 * Given a linked list of integers, find and return the middle element of the linked list.
 * <p>
 * NOTE: If there are N nodes in the linked list and N is even then return the (N/2 + 1)th element.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= length of the linked list <= 100000
 * <p>
 * 1 <= Node value <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * The only argument given head pointer of linked list.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the middle element of the linked list.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * 1 -> 2 -> 3 -> 4 -> 5
 * Input 2:
 * <p>
 * 1 -> 5 -> 6 -> 2 -> 3 -> 4
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 3
 * Output 2:
 * <p>
 * 2
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * The middle element is 3.
 * Explanation 2:
 * <p>
 * The middle element in even length linked list of length N is ((N/2) + 1)th element which is 2.
 */
public class MiddleElementOfLinkedList {

    public int solve(ListNode A) {

        if (A.next == null) {
            return A.val;
        }
        ListNode slowNode = A;
        ListNode fastNode = A;


        while (fastNode.next != null && fastNode.next.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        if (fastNode.next != null) {
            slowNode = slowNode.next;
        }
        return slowNode.val;
    }

}
