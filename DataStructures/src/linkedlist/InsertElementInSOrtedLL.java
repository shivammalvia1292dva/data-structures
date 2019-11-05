package linkedlist;

public class InsertElementInSOrtedLL {
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
    InsertElementInSOrtedLL insertionInLL = new InsertElementInSOrtedLL();
    insertionInLL.head = head;
    insertionInLL.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    int count = 0;
    insertElement(insertionInLL.head, 9);
    System.out.println();
  }

  private static void insertElement(Node head, int element) {
    while (head != null && head.next != null) {
      if(head.data < element && head.next.data > element){
        Node insertElement = new Node(element);
        Node next = head.next.next;
        head.next = insertElement;
        insertElement.next = next;
      }
      head = head.next;
    }
  }
}
