package in.thilakraj;

public class InsertInLinkedList {

    public ListNode solve(ListNode A, int B, int C) {


        ListNode node = A, headNode = A;

        for (int i = 0; i < C - 1 && node.next != null; i++) {
            node = node.next;
        }

        ListNode newNode = new ListNode(B);

        if (node.next == null) {
            node.next = newNode;
        } else if (C == 0) {
            newNode.next = headNode;
            headNode = newNode;
        } else {
            newNode.next = node.next;
            node.next = newNode;
        }

        return headNode;

    }
}

