package Problems;

import java.util.Scanner;

public class Main {

  public int sum(int n, int m) {
    if (n % (2 * m) != 0 ) {
      return -1;
    }

    int res = 0;

    int[] array = new int[n];

    for (int i = 0; i < n; i++) {
      array[i] = i + 1;
    }

    int cnt = m;

    for (int j = 0; j < n; j++) {
      cnt--;
      if (cnt >= 0 && j < n) {
        array[j] = Math.negateExact(j + 1);
      } else {
        cnt = m;
        j = j + m - 1;
      }
    }

    for (int k = 0; k < n; k++) {
      res += array[k];
    }

    return res;
  }

  public static void main(String[] args) {
    Main test = new Main();
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt()) {//注意while处理多个case
      int a = in.nextInt();
      int b = in.nextInt();
      int res = test.sum(a, b);
      System.out.println(res);
    }
  }
}
