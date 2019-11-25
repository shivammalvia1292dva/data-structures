package linkedlist;

public class RemoveDuplicateFromAUnSortedLL {
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
    Node third = new Node(7);
    Node fourth = new Node(1);
    Node fifth = new Node(11);
    RemoveDuplicateFromAUnSortedLL insertionInLL = new RemoveDuplicateFromAUnSortedLL();
    insertionInLL.head = head;
    insertionInLL.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    removeDuplicateNewMethod(insertionInLL.head);
    System.out.println();
  }

  public static void removeDuplicateNewMethod(Node head) {
    if (head == null || head.next == null) {
      return;
    }
    Node currfp = head;
    while (currfp != null) {
      Node secfp = currfp;
      while (secfp.next != null) {
        Node prevSecFp = secfp;
        if (currfp.data == secfp.next.data) {
          prevSecFp.next = secfp.next.next;
        }
        secfp = secfp.next;
      }
      currfp = currfp.next;
    }
  }
  //  public static void removeDuplicate(Node head) {
  //    while (head != null) {
  //      Node secondNode = head.nextOne;
  //      while (secondNode != null) {
  //        if(head.data == secondNode.data){
  //          Node nextOfSecondNode = secondNode.nextOne;
  //          head.nextOne = nextOfSecondNode;
  //        }
  //        secondNode = secondNode.nextOne;
  //      }
  //      head = head.nextOne;
  //    }
  //  }
}
