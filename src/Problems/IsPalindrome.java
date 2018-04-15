package Problems;

public class IsPalindrome {

  public boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) {
      return true;
    }
    ListNode fast = head;
    ListNode slow = head;
    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    ListNode midHead = slow.next;
    ListNode p1 = midHead;
    ListNode p2 = p1.next;
    slow.next = null;
    //后半部分链表反转
    while (p1 != null && p2 != null) {
      ListNode temp = p2.next;
      p2.next = p1;
      p1 = p2;
      p2 = temp;
    }

    while (p1 != null) {
      if (head.val != p1.val) {
        return false;
      }
      head = head.next;
      p1 = p1.next;
    }
    return true;
  }


}
