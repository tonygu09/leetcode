public class leetcode206 {
    public static void main(String[] args) {
        ListNode t1 = new ListNode(1);
        ListNode t2 = new ListNode(2);
        ListNode t3 = new ListNode(3);
        ListNode t4 = new ListNode(4);
        ListNode t5 = new ListNode(5);

        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = t5;

        reverseList(t1);

        ListNode tester = t5;

        while(tester != null) {
            System.out.println(tester.val);
            tester = tester.next;
        }

    }

    public static ListNode reverseList(ListNode head) {
        ListNode nextNode = new ListNode();
        ListNode prevNode = null;
        while (head != null) {
            nextNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        }

        return prevNode;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
