package in.thilakraj;

public class ReverseALinkedList {

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
