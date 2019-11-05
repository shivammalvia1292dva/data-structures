package linkedlist;

public class DeleteAllElementsOneByOneOfLL {
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
    DeleteAllElementsOneByOneOfLL insertionInLL = new DeleteAllElementsOneByOneOfLL();
    insertionInLL.head = head;
    insertionInLL.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    deleteElements(insertionInLL.head);
    System.out.println();
  }

  private static void deleteElements(Node head) {
    if (head.next == null) {
      return;
    }
    deleteElements(head.next);
    if(head.next.next == null){
      head.next = null;
    }
  }
}
