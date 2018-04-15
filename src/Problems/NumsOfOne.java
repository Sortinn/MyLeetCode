package Problems;

public class NumsOfOne {
  private int numsOfOne(int num) {
    int res = 0;
    while (num != 0) {
      res++;
      num = (num - 1) & num;
    }
    return res;
  }

  public static void main(String[] args) {
    NumsOfOne test = new NumsOfOne();
    System.out.println(test.numsOfOne(0x7fffffff));
  }
}
