package linkedlist;

// swap two element in a ll...you should not swap the data as it might be costly rather it is
// advisable to swap the links rather then the data.
public class SwapElementInLL {
  Node head;

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    Node second = new Node(7);
    Node third = new Node(8);
    Node fourth = new Node(11);
    Node fifth = new Node(12);
    SwapElementInLL insertionInLL = new SwapElementInLL();
    insertionInLL.head = head;
    insertionInLL.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    int count = 0;
    swap(insertionInLL.head, 7, 11);
    System.out.println();
  }

  // find both element previous nodes and current nodes then first sahi kar previous nodes to nextOne
  // node wala pointer for both elements and then sahi nextOne wala pointer swap kar de thir variable
  // ki help se
  private static void swap(Node head, int firstElement, int secondElement) {
    Node firstElePrevNode = null;
    Node firstEleCurrNode = null;
    Node secondElePrevNode = null;
    Node secondEleCurrNode = null;
    while (head.next != null) {
      Node prev = head;
      Node curr = prev.next;
      if (curr.data == firstElement) {
        firstElePrevNode = prev;
        firstEleCurrNode = curr;
      }
      if (curr.data == secondElement) {
        secondElePrevNode = prev;
        secondEleCurrNode = curr;
      }
      head = head.next;
    }
    // first element is head
    if (firstElePrevNode == null) {}
    // elememtn is same
    if (firstEleCurrNode == secondEleCurrNode) {
      return;
    }
    firstElePrevNode.next = secondEleCurrNode;
    secondElePrevNode.next = firstEleCurrNode;

    Node temp = firstEleCurrNode.next;
    firstEleCurrNode.next = secondEleCurrNode.next;
    secondEleCurrNode.next = temp;
  }
}
