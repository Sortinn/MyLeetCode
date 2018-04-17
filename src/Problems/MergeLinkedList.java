package Problems;

public class MergeLinkedList {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //输入空链表的情况
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }

    ListNode MergedHead = null;

    if (l1.val < l2.val) {
      MergedHead = l1;
      MergedHead.next = mergeTwoLists(l1.next, l2);
    }else {
      MergedHead = l2;
      MergedHead.next = mergeTwoLists(l1, l2.next);
    }
    return MergedHead;
  }
}
