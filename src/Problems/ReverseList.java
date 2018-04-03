package Problems;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
//        /**
//         * 递归法
//         */
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode p1 = head;
//        ListNode p2 = head.next;
//        while (p2 != null) {
//            ListNode temp = p2.next;
//            p2.next = p1;
//            p1 = p2;
//            p2 = temp;
//        }
//        head.next = null;
//        return head;
//    }


        if (head == null || head.next == null) {
            return head;
        }
        ListNode p1 = head.next;
        ListNode p2;
        while (p1.next != null) {
            p2 = p1.next;
            p1.next = p2.next;
            p2.next = head.next;
            head.next = p2;
        }
        p1.next = head;
        head = p1.next.next;
        p1.next.next = null;

        return head;
    }
}
