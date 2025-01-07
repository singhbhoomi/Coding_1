class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class mergeLists {
    public static Node mergeLists(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node curr = dummy;

        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }

        if (head1 != null) {
            curr.next = head1;
        } else if (head2 != null) {
            curr.next = head2;
        }

        return dummy.next;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static Node createList(int[] values) {
        if (values.length == 0) return null;

        Node head = new Node(values[0]);
        Node current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] values1 = {1, 3, 5};
        int[] values2 = {2, 4, 6};

        Node head1 = createList(values1);
        Node head2 = createList(values2);

        System.out.println("List 1:");
        printList(head1);
        System.out.println("List 2:");
        printList(head2);

        Node mergedHead = mergeLists(head1, head2);
        System.out.println("Merged List:");
        printList(mergedHead);
    }
}
