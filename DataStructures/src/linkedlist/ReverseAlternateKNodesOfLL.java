package linkedlist;

// Very simple just call recursively the logic of reversing and introduce a counter variable to
// count how many number needs to be repeated just traverse k distance before reversing
public class ReverseAlternateKNodesOfLL {
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
    Node sixth = new Node(15);
    ReverseAlternateKNodesOfLL insertionInLL = new ReverseAlternateKNodesOfLL();
    insertionInLL.head = head;
    insertionInLL.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    int k = 2;
    Node reversell = reverseLL(insertionInLL.head, k);
    System.out.println();
  }

  public static Node reverseLL(Node firstHead, int k) {
    Node curr = firstHead;
    Node secondHead = null;
    Node firstNext = null;
    int counter = 0;
    while (curr != null && counter < k) {
      firstNext = curr.next;
      curr.next = null;

      curr.next = secondHead;
      secondHead = curr;

      curr = firstNext;

      counter++;
    }
    int traverseCount = 0;
    while (traverseCount < k - 1 && curr != null) {
      firstHead.next = curr;
      curr = curr.next;
      traverseCount++;
    }
    if (firstNext != null) {
      curr.next = reverseLL(curr.next, k);
    }
    System.out.println();
    return secondHead;
  }
}
