package in.thilakraj;

/**
 * Problem Description
 * You are given the head of a linked list A and an integer B. You need to find the B-th element of the linked list.
 * <p>
 * Note : Follow 0-based indexing for the node numbering.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= size of linked list <= 105
 * <p>
 * 1 <= value of nodes <= 109
 * <p>
 * 0 <= B < size of linked list
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument A is the head of a linked list.
 * <p>
 * The second arguement B is an integer.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = 1 -> 2 -> 3
 * B = 0
 * Input 2:
 * A = 4 -> 3 -> 2 -> 1
 * B = 1
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 * 3
 * <p>
 * <p>
 * Example Explanation
 * For Input 1:
 * The 0-th element of the linked list is 1.
 * For Input 2:
 * The 1-st element of the linked list is 3.
 */
public class KthElementInLinkedList {

    public int solve(ListNode A, int B) {

        ListNode node = A;

        for (int i = 0; i < B && node.next != null; i++) {
            node = node.next;
        }

        return node.val;
    }

}

