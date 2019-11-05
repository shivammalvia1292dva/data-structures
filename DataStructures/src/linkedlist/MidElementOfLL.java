package linkedlist;

// in case of even both can be mid the center elements
public class MidElementOfLL {
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
    Node sixth = new Node(20);
    MidElementOfLL insertionInLL = new MidElementOfLL();
    insertionInLL.head = head;
    insertionInLL.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    int count = 0;
    int midElement = midElementOfLL(insertionInLL.head);
    System.out.println();
  }
  // A very classic example of using your IQ you start two pointers
  private static int midElementOfLL(Node head) {
    if (head == null) {
      return -1;
    }
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow.data;
  }
}
