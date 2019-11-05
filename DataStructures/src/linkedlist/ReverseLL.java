package linkedlist;

// Use three pointers current and next in first LL and top pointer in second LL
public class ReverseLL {
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
    ReverseLL insertionInLL = new ReverseLL();
    insertionInLL.head = head;
    insertionInLL.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    int count = 0;
    reverseLL(insertionInLL.head);
    System.out.println();
  }

  public static void reverseLL(Node firstHead) {
    Node secondHead = null;
    Node firstNext = null;
    while (firstHead != null) {
      firstNext = firstHead.next;
      firstHead.next = null;

      firstHead.next = secondHead;
      secondHead = firstHead;

      firstHead = firstNext;
    }
    System.out.println();
  }
}
