package linkedlist;

public class MergeSortOfLL {
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
    Node fourth = new Node(15);
    Node fifth = new Node(120);
    Node sixth = new Node(2);
    MergeSortOfLL insertionInLL = new MergeSortOfLL();
    insertionInLL.head = head;
    insertionInLL.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    int count = 0;
    mergeSort(insertionInLL.head);
    System.out.println();
  }
  // middle has to made null so as to break the entire list in two lists
  private static void mergeSort(Node head) {
    if (head == null || head.next == null) {
      return;
    }

    Node middle = findMiddle(head);
    Node secondHead = middle.next;

    middle.next = null;

    mergeSort(head);
    mergeSort(secondHead);
    Node node = mergeLL(head, secondHead);
    System.out.println();
  }

  private static Node mergeLL(Node head, Node middle) {
    Node result = null;
    if (head == null) {
      return middle;
    }
    if (middle == null) {
      return head;
    }
    if (head.data < middle.data) {
      result = head;
      result.next = mergeLL(head.next, middle);
    }
    if (head.data > middle.data) {
      result = middle;
      result.next = mergeLL(head, middle.next);
    }
    return result;
  }

  private static Node findMiddle(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}
