package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

  private ArrayList<Integer> Y = new ArrayList<>();

  public boolean findOuNum(int N) {

    for (int i = 1; i < N; i += 2) {
      if (((N / i) % 2) == 0) {
        int y = N / i;
        Y.add(y);
      }
    }

    if (Y.size() != 0) {
      return true;
    }
    return false;
  }

  public void printRes(int N) {
    Boolean find = findOuNum(N);
    if (find && Y.size() == 1) {
      System.out.println(N / Y.get(0) + " " + Y.get(0));
    } else if (find && Y.size() > 1) {
      int[] Ys = new int[Y.size()];
      for (int i = 0; i < Y.size(); i++) {
        Ys[i] = Y.get(i);
      }
      Arrays.sort(Ys);
      System.out.println(N / Ys[0] + " " + Ys[0]);
    } else {
      System.out.println("No");
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      Main3 test = new Main3();
      int num = sc.nextInt();
      test.printRes(num);
    }
  }
}
