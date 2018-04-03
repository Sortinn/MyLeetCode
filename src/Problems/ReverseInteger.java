import java.util.Stack;

public class ReverseInteger {

    // private int result;

    public int reverse(int x) {
    //     if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
    //         return 0;
    //     }

    //     if (x < 0) {
    //         int number = Math.abs(x);
    //         result = Math.negateExact(reverseTrue(number));
    //     } else {
    //         result = reverseTrue(x);
    //     }
    //     return result;
    // }

    // private int reverseTrue(int x) {
    //     Stack stack = new Stack();
    //     char[] charsX = (x + "").toCharArray();
    //     for (int i = 0; i < charsX.length; i++) {
    //         stack.push(charsX[i]);
    //     }
    //     String s = "";
    //     while (!stack.isEmpty()) {
    //         s += stack.pop();
    //     }
    //     return Integer.parseInt(s);
    // }

    int result = 0;

    while (x != 0)
    {
        int tail = x % 10;
        int newResult = result * 10 + tail;
       if ((newResult - tail) / 10 != result)
        { return 0; }
        result = newResult;
        x = x / 10;
    }

    return result;
}
}
