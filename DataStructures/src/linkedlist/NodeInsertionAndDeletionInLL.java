package linkedlist;

public class NodeInsertionAndDeletionInLL {
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
    NodeInsertionAndDeletionInLL insertionInLL = new NodeInsertionAndDeletionInLL();
    insertionInLL.head = head;
    insertionInLL.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;

    // traverseLL(insertionInLL);

    insertAtEnd(insertionInLL, 3);
    insertAtStart(insertionInLL, 10);
    insertAtPosition(insertionInLL, 100, 2);
    searchAndDeleteNode(insertionInLL, 100);

    traverseLL(insertionInLL);
  }

  private static void searchAndDeleteNode(NodeInsertionAndDeletionInLL insertionInLL, int data) {
    Node head = insertionInLL.head;
    while (head != null) {
      Node prev = head;
      Node curr = head.next;
      if (curr.data == data) {
        prev.next = curr.next;
        break;
      }
      head = head.next;
    }
  }

  private static void insertAtStart(NodeInsertionAndDeletionInLL insertionInLL, int i) {
    Node node = new Node(i);
    Node currentHead = insertionInLL.head;
    insertionInLL.head = node;
    node.next = currentHead;
  }

  private static void insertAtPosition(NodeInsertionAndDeletionInLL insertionInLL, int value, int position) {
    Node nodeToBeInserted = new Node(value);
    int counter = 0;
    Node currentPointer = insertionInLL.head;
    while (currentPointer != null) {
      Node previousPointer = currentPointer;
      currentPointer = currentPointer.next;
      counter++;
      if (counter == position) {
        previousPointer.next = nodeToBeInserted;
        nodeToBeInserted.next = currentPointer;
        break;
      }
    }
  }

  private static void insertAtEnd(NodeInsertionAndDeletionInLL insertionInLL, int i) {
    Node node = insertionInLL.head;
    while (node.next != null) {
      node = node.next;
    }
    node.next = new Node(i);
  }

  private static void traverseLL(NodeInsertionAndDeletionInLL insertionInLL) {
    Node node = insertionInLL.head;
    while (node != null) {
      System.out.println(node.data);
      node = node.next;
    }
  }
}
