package linkedlist;

//Use the same strategy as merge sort
public class MergeTwoSortedLL {
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
    Node second = new Node(17);
    Node third = new Node(80);
    Node fourth = new Node(12);
    Node fifth = new Node(20);
    Node sixth = new Node(120);
    MergeTwoSortedLL firstLL = new MergeTwoSortedLL();
    firstLL.head = head;
    firstLL.head.next = second;
    second.next = third;

    MergeTwoSortedLL secondLL = new MergeTwoSortedLL();
    secondLL.head = fourth;
    fourth.next = fifth;
    fifth.next = sixth;

    Node result = mergeTwoSortedLL(firstLL.head, secondLL.head);
    System.out.println();
  }

  private static Node mergeTwoSortedLL(Node firstLL, Node secondLL) {
    Node result = null;
    if (firstLL == null) {
      return secondLL;
    }
    if (secondLL == null) {
      return firstLL;
    }
    if (firstLL.data < secondLL.data) {
      result = firstLL;
      result.next = mergeTwoSortedLL(firstLL.next, secondLL);
    }
    if (secondLL.data < firstLL.data) {
      result = secondLL;
      result.next = mergeTwoSortedLL(firstLL, secondLL.next);
    }
    return result;
  }
}
