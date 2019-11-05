package linkedlist;

public class SearchElementInLLRecursive {
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
    SearchElementInLLRecursive insertionInLL = new SearchElementInLLRecursive();
    insertionInLL.head = head;
    insertionInLL.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    int element = 14;
    boolean isAvailable = findLength(insertionInLL.head, element);
    System.out.println();
  }

  private static boolean findLength(Node head, int element) {
    if(head == null){
      return false;
    }
    if(head.data == element){
      return true;
    }
    boolean isAvailable = findLength(head.next,element);
    return isAvailable;

  }
}
