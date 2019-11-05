package linkedlist;

public class LengthOfLLRecursive {
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
    LengthOfLLRecursive insertionInLL = new LengthOfLLRecursive();
    insertionInLL.head = head;
    insertionInLL.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    int count = 0;
    int length = findLength(insertionInLL.head);
    System.out.println();
  }

  public static int findLength(Node head) {
    if (head == null) {
      return 0;
    }
    return 1 + findLength(head.next);
  }
}
