package in.thilakraj;

/**
 * Problem Description
 * Sort a linked list, A in O(n log n) time.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 0 <= |A| = 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first and the only arugment of input contains a pointer to the head of the linked list, A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a pointer to the head of the sorted linked list.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [3, 4, 2, 8]
 * Input 2:
 * <p>
 * A = [1]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [2, 3, 4, 8]
 * Output 2:
 * <p>
 * [1]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * The sorted form of [3, 4, 2, 8] is [2, 3, 4, 8].
 * Explanation 2:
 * <p>
 * The sorted form of [1] is [1].
 */
public class SortList {

    public ListNode sortList(ListNode A) {
        return mergeSort(A);
    }

    public ListNode mergeSort(ListNode headNode) {

        if (headNode == null || headNode.next != null) {
            return headNode;
        }

        ListNode middle = findMiddleNode(headNode);
        ListNode anotherLowEnd = middle.next;
        middle.next = null;
        ListNode lNode = mergeSort(headNode);
        ListNode hNode = mergeSort(anotherLowEnd);
        return mergeTwoLists(lNode, hNode);
    }

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

    public ListNode findMiddleNode(ListNode A) {

        if (A == null) {
            return A;
        }
        ListNode slowNode = A;
        ListNode fastNode = A;


        while (fastNode.next != null && fastNode.next.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        return slowNode;
    }

}
