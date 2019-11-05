package linkedlist;

public class RemoveDuplicateFromASortedLL {
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
    Node second = new Node(1);
    Node third = new Node(7);
    Node fourth = new Node(7);
    Node fifth = new Node(17);
    RemoveDuplicateFromASortedLL insertionInLL = new RemoveDuplicateFromASortedLL();
    insertionInLL.head = head;
    insertionInLL.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    removeDuplicateRecursively(insertionInLL.head);
    System.out.println();
  }

  public static void removeDuplicateRecursively(Node head) {
    if (head == null || head.next == null) {
      return;
    }
    if (head.data == head.next.data) {
      head.next = head.next.next;
    }
    removeDuplicateRecursively(head.next);
  }
}
