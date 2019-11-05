package linkedlist;

//this does not works refer geeks
public class ReverseLLRecursively {
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
    ReverseLLRecursively insertionInLL = new ReverseLLRecursively();
    insertionInLL.head = head;
    insertionInLL.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    int count = 0;
    reverseLL(insertionInLL.head, null);
    System.out.println();
  }

  public static void reverseLL(Node head, Node prev) {
  }
}
