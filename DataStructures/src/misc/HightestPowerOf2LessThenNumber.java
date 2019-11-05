package misc;

import binarySearchTree.ConstructBSTFromPreorderTraversal;

// Some people are standing in a queue. A selection process follows a rule where people standing on
// even positions are selected. Of the selected people a queue is formed and again out of these only
// people on even position are selected. This continues until we are left with one person. GFG out
// the position of that person in the original queue.
// Print the position(original queue) of that person who is left.
public class HightestPowerOf2LessThenNumber {
  public static void main(String[] args) {
    double number = 17;
    double counter = findNumber(number);
    System.out.println(counter);
  }

  private static double findNumber(double number) {
    double sum = 2;
    double numberOutput = 0;
    double check = 0;
    for (double i = 0; i <= number / 2 - 1; i++) {
      check = numberOutput;
      numberOutput = Math.pow(sum, i);
      if (numberOutput > number) {
        return check;
      }
    }
    return 0;
  }
}
