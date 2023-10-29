package in.thilakraj;

/**
 * Problem Description
 * You are given a linked list that contains a loop.
 * You need to find the node, which creates a loop and break it by making the node point to NULL.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= number of nodes <= 1000
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first of the input contains a LinkedList, where the first number is the number of nodes N, and the next N nodes are the node value of the linked list.
 * The second line of the input contains an integer which denotes the position of node where cycle starts.
 * <p>
 * <p>
 * <p>
 * Output Format
 * return the head of the updated linked list.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * <p>
 * 1 -> 2
 * ^    |
 * | - -
 * Input 2:
 * <p>
 * 3 -> 2 -> 4 -> 5 -> 6
 * ^         |
 * |         |
 * - - - - - -
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1 -> 2 -> NULL
 * Output 2:
 * <p>
 * 3 -> 2 -> 4 -> 5 -> 6 -> NULL
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Chain of 1->2 is broken.
 * Explanation 2:
 * <p>
 * Chain of 4->6 is broken.
 */
public class RemoveLoopLinkedList {

    public ListNode solve(ListNode A) {

        ListNode slow = A, fast = A;
        boolean isCycleExist = false;
        while (fast != null && fast.next != null) { // check is cycle is exist or not
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                isCycleExist = true;
                break;
            }
        }

        if (isCycleExist == false) { // if not exist then retun A
            return A;
        }

        slow = A; // reinitialize slow with head note

        while (fast != slow) { // when both are equal then stop moveing
            fast = fast.next;
            slow = slow.next;
        }

        while (fast != null) { // now move only fast untill fast.next == slow
            if (fast.next == slow) { // when we get fast.next == slow
                fast.next = null; // then set fast.next pointer to null for break the loop
            }
            fast = fast.next;
        }

        return A;
    }
}
