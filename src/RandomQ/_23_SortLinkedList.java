package RandomQ;

/**
 * WAP TO SORT LINKED LIST
 */
public class _23_SortLinkedList {

        public static ListNode sortList(ListNode head) {
            if(head == null || head.next == null) return head;

            ListNode key = head;
            ListNode min;
            ListNode node;

            do {
                min = key;
                node = key.next;

                while(node != null) {
                    if(min.val > node.val) {
                        min = node;
                    }
                    node = node.next;
                }

                // SWAP
                if(key.val > min.val) {
                    int temp = min.val;
                    min.val = key.val;
                    key.val = temp;
                }

                key = key.next;
            } while (key.next != null);

            return head;
        }

    private static class ListNode {
            int val;
            ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4, null);
        head.next = new ListNode(2, null);
        head.next.next = new ListNode(1, null);
        head.next.next.next = new ListNode(3, null);

        System.out.print("Original: ");
        display(head);

        sortList(head);

        System.out.print("Sorted: ");
        display(head);
    }

    private static void display(ListNode head) {
        System.out.print("HEAD");
        ListNode node = head;
        while (node != null) {
            System.out.print(" -> "+node.val);
            node = node.next;
        }
        System.out.println();
    }
}