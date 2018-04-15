package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {


  private int cnt = 0;

  public ListNode generateList(String s) {
    char[] chars = s.toCharArray();
    ListNode head = new ListNode(chars[0]);
    for (int i = 1; i < chars.length; i++) {
      head.next = new ListNode(chars[i]);
    }
    return head;
  }

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

  public int getCnt(String s) {
    int len = s.length();
    cnt += len;
    ListNode head = generateList(s);
    if (isPalindrome(head)) {
      cnt ++;
    }

    for (int i = 0; i < len; i++) {

    }
    return cnt;
  }



  public static void main(String[] args) {
    Main2 test = new Main2();
    Scanner in = new Scanner(System.in);
    String s = in.next();
    System.out.println(test.getCnt(s));
  }

}
