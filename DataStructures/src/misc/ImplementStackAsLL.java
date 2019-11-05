package misc;

public class ImplementStackAsLL {
  static Node top;

  static class Node {
    int data;
    Node prev;

    Node(int data) {
      this.data = data;
      prev = null;
    }
  }

  public static void main(String[] args) {
    int arr[] = {12, 11, 10, 5, 6, 2, 30};
    pushInStack(12);
    pop();
  }

  public static void pushInStack(int data) {
    Node element = new Node(data);
    if (top == null) {
      top = element;
      return;
    }
    element.prev = top;
    top = element;
  }

  public static int pop() {
    int data = top.data;
    top = top.prev;
    return data;
  }

  public static int peek() {
    return top.data;
  }
}
