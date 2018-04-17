import java.util.Stack;

public class Stacks {



  public void operateIt(String[] months) {
    Stack monthStack = new Stack();
    int i = 0;
    while (++i < months.length) {
      monthStack.push( months[i]);
    }
    System.out.println("Stack = " + monthStack);
    monthStack.addElement("The last line");
    System.out.println("element 5 = " + monthStack.elementAt(5));
    System.out.println("popping elements:");
    while (!monthStack.isEmpty()) {
      System.out.println(monthStack.pop());
    }
  }


  public static void main(String[] args) {
     String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    Stacks stacks = new Stacks();
    stacks.operateIt(months);
  }
}
