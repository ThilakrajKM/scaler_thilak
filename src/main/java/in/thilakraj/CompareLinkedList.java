package in.thilakraj;

/**
 * Problem Description
 * Given heads of two linked lists A and B, check if they are identical i.e. each of their corresponding nodes should contain the same data. The two given linked lists may or may not be of the same length.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= size of linked lists <= 105
 * <p>
 * 1 <= value of each node <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * You are given the head of two linked lists A and B.
 * <p>
 * <p>
 * Output Format
 * Return 1 if both the linked lists are identical and 0 otherwise
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = 1 -> 2 -> 3
 * B = 1 -> 2 -> 3
 * Input 2:
 * A = 4 -> 3 -> 2 -> 1
 * B = 4 -> 2 -> 3 -> 1
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 * 0
 * <p>
 * <p>
 * Example Explanation
 * For Input 1:
 * Both the linked lists are identical
 * For Input 2:
 * The value in the second node of both the linked lists
 * are different.
 */
public class CompareLinkedList {

    public int solve(ListNode A, ListNode B) {

        ListNode nodeA = A, nodeB = B;

        while (nodeB.next != null && nodeA.next != null) {
            if (nodeB.val != nodeA.val) {
                return 0;
            }
            nodeB = nodeB.next;
            nodeA = nodeA.next;
        }

        if (nodeB.next != null || nodeA.next != null) {
            return 0;
        }

        return 1;
    }
}
