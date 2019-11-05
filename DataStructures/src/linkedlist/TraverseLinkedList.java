package linkedlist;

public class TraverseLinkedList {
  Node head;

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public static void main(String[] args) {
    TraverseLinkedList traverseLinkedList = new TraverseLinkedList();
    traverseLinkedList.head = new Node(5);
    Node second = new Node(7);
    Node third = new Node(8);
    Node fourth = new Node(11);
    Node fifth = new Node(12);
    traverseLinkedList.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;

    traverseLL(traverseLinkedList);
    copyLL(traverseLinkedList);
  }

  // O(n^2) Complexity
  private static void copyFirstLL(TraverseLinkedList traverseLinkedList) {
    TraverseLinkedList secondLinkedList = new TraverseLinkedList();
    Node firstListNode = traverseLinkedList.head;
    secondLinkedList.head = firstListNode;
    while (firstListNode != null) {
      Node secondListNode = secondLinkedList.head;
      while (true) {
        if (secondListNode.next == null) {
          secondListNode = firstListNode;
          break;
        }
        secondListNode = secondListNode.next;
      }
      firstListNode = firstListNode.next;
    }
    traverseLL(secondLinkedList);
  }

  // O(n) Complexity
  private static void copyLL(TraverseLinkedList traverseLinkedList) {
    TraverseLinkedList secondLinkedList = new TraverseLinkedList();
    Node firstListNode = traverseLinkedList.head;
    Node secondListNode = firstListNode;
    secondLinkedList.head = secondListNode;
    while (firstListNode != null) {
      secondListNode.next = firstListNode.next;
      secondListNode = secondListNode.next;
      firstListNode = firstListNode.next;
    }
    traverseLL(secondLinkedList);
  }

  private static void traverseLL(TraverseLinkedList traverseLinkedList) {
    Node node = traverseLinkedList.head;
    while (node != null) {
      System.out.println(node.data);
      node = node.next;
    }
  }
}
