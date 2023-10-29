package in.thilakraj;

/**
 * Merge two sorted linked lists, A and B, and return it as a new list.
 * <p>
 * The new list should be made by splicing together the nodes of the first two lists and should also be sorted.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 0 <= |A|, |B| <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument of input contains a pointer to the head of linked list A.
 * <p>
 * The second argument of input contains a pointer to the head of linked list B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a pointer to the head of the merged linked list.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = 5 -> 8 -> 20
 * B = 4 -> 11 -> 15
 * Input 2:
 * <p>
 * A = 1 -> 2 -> 3
 * B = Null
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 4 -> 5 -> 8 -> 11 -> 15 -> 20
 * Output 2:
 * <p>
 * 1 -> 2 -> 3
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Merging A and B will result in 4 -> 5 -> 8 -> 11 -> 15 -> 20
 * Explanation 2:
 * <p>
 * We don't need to merge as B is empty.
 */
public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode mergeListHead, mergeCurrentNode;

        if (A == null || B == null) {
            if (A == null) {
                return B;
            } else {
                return A;
            }
        }

        ListNode currA = A, currB = B;

        if (currA.val < currB.val) {
            mergeListHead = currA;
            mergeCurrentNode = currA;
            currA = currA.next;
        } else {
            mergeListHead = currB;
            mergeCurrentNode = currB;
            currB = currB.next;
        }

        while (currA != null && currB != null) {

            if (currA.val < currB.val) {
                mergeCurrentNode.next = currA;
                currA = currA.next;
            } else {
                mergeCurrentNode.next = currB;
                currB = currB.next;
            }

            mergeCurrentNode = mergeCurrentNode.next;
        }

        if (currA != null) {
            mergeCurrentNode.next = currA;
        }
        if (currB != null) {
            mergeCurrentNode.next = currB;
        }
        return mergeListHead;
    }
}
