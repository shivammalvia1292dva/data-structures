package linkedlist;

// copy nextOne node data into this current node and delete nextOne node
public class DeleteNodeWithReferenceToOnlyThatNode {
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
    DeleteNodeWithReferenceToOnlyThatNode insertionInLL =
        new DeleteNodeWithReferenceToOnlyThatNode();
    insertionInLL.head = head;
    insertionInLL.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    int count = 0;
    deleteNode(sixth);
    System.out.println();
  }

  private static void deleteNode(Node node) {
    if (node == null) {
      return;
    }
    Node next = node.next;
    if (next == null) {
      //cannot do anything
    } else {
      node.data = next.data;
      node.next = next.next;
    }
  }
}
