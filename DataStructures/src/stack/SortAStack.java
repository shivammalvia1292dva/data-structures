package stack;

import java.util.Stack;

// Sort a stack using a auxillary stack
public class SortAStack {
  public static void main(String[] args) {

    Stack<Integer> integerStack = new Stack<>();
    integerStack.push(10);
    integerStack.push(5);
    integerStack.push(15);
    integerStack.push(6);
    integerStack.push(18);
    integerStack.push(1);

    Stack<Integer> auxillaryStack = new Stack<>();

    sortStack(integerStack, auxillaryStack);
    System.out.println(auxillaryStack);
  }
  // if the element in the original stack is greater then the top element of aux stack then there is
  // no problem...if not then you need to pop the auxiliary stack till element from auxiliary stack
  // is smaller then orignal stack
  private static void sortStack(Stack<Integer> integerStack, Stack<Integer> auxillaryStack) {
    while (!integerStack.isEmpty()) {
      if (auxillaryStack.isEmpty()) {
        int firstElement = integerStack.pop();
        auxillaryStack.push(firstElement);
      }
      int element = integerStack.pop();

      if (element < auxillaryStack.peek()) {
        int auxillaryStackElement = auxillaryStack.pop();
        integerStack.push(auxillaryStackElement);
        integerStack.push(element);
      } else {
        auxillaryStack.push(element);
      }
    }
  }
}
