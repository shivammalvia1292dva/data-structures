package linkedlist;

// Take two pinters one slow and one fast if they meet agin there is a loop otherwise not and they
// would always meet at just the befor the loop startup always

//this is wrong implementation please check on google
public class DetectAndRemoveLoop {
  static Node head;

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
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);
    Node fifth = new Node(5);
    DetectAndRemoveLoop detectLoopInLL = new DetectAndRemoveLoop();
    detectLoopInLL.head = head;
    detectLoopInLL.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = second;
    boolean isThereLoop = detectLoop(detectLoopInLL.head);
    System.out.println();
  }

  public static boolean detectLoop(Node firstHead) {
    Node slow = firstHead;
    Node fast = firstHead;
    while (fast != null && fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        fast.next = null;
        return true;
      }
    }
    return false;
  }
}
