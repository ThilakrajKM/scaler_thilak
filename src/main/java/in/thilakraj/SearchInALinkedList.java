package in.thilakraj;

/**
 * Problem Description
 * You are given the head of a linked list A and an integer B, check if there is any node which contains this value B.
 * <p>
 * Return 1 if such a node is present else return 0.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= size of linked list <= 105
 * 1 <= value of nodes <= 109
 * 1 <= B <= 109
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
 * Return 1 if such a node is present otherwise return 0.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = 1 -> 2 -> 3
 * B = 4
 * Input 2:
 * A = 4 -> 3 -> 2 -> 1
 * B = 4
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 0
 * Output 2:
 * 1
 * <p>
 * <p>
 * Example Explanation
 * For Input 1:
 * None of the nodes have a value 4.
 * For Input 2:
 * The first node has a value 4.
 */
public class SearchInALinkedList {

    public int solve(ListNode A, int B) {

        ListNode node = A;

        do {
            if (node.val == B) {
                return 1;
            }
            node = node.next;
        } while (node != null);

        return 0;
    }

}
