package in.thilakraj;

/**
 * Problem Description
 * Given a singly linked list A, determine if it's a palindrome. Return 1 or 0, denoting if it's a palindrome or not, respectively.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first and the only argument of input contains a pointer to the head of the given linked list.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return 0, if the linked list is not a palindrome.
 * <p>
 * Return 1, if the linked list is a palindrome.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 2, 2, 1]
 * Input 2:
 * <p>
 * A = [1, 3, 2]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1
 * Output 2:
 * <p>
 * 0
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * The first linked list is a palindrome as [1, 2, 2, 1] is equal to its reversed form.
 * Explanation 2:
 * <p>
 * The second linked list is not a palindrom as [1, 3, 2] is not equal to [2, 3, 1].
 */
public class PalindromeList {

    public int lPalin(ListNode A) {

        int totNodes = 0;

        ListNode curNode = A;
        while (curNode != null) {
            totNodes++;
            curNode = curNode.next;
        }

        int mid = totNodes / 2;
        int i = 1;
        curNode = A;
        while (i <= mid) {
            curNode = curNode.next;
            i++;
        }
        ListNode midNode = curNode;

        midNode = reverseList(curNode);

        curNode = A;
        i = 1;
        while (i <= mid) {
            if (curNode.val != midNode.val) {
                return 0;
            }
            curNode = curNode.next;
            midNode = midNode.next;
            i++;
        }

        return 1;
    }

    public ListNode reverseList(ListNode A) {
        ListNode currNode = A;
        ListNode prevNode = null;
        while (currNode != null) {
            ListNode forwardNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = forwardNode;
        }


        return prevNode;
    }
}
