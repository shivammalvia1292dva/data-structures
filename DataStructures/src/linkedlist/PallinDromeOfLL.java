package linkedlist;

import misc.ImplementStackAsLL;

// insert all element ins a stack and check one by one element of LL with stack if they are all
// equal then it is pallindrome
public class PallinDromeOfLL {
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
    Node fourth = new Node(8);
    Node fifth = new Node(7);
    Node sixth = new Node(1);
    PallinDromeOfLL insertionInLL = new PallinDromeOfLL();
    insertionInLL.head = head;
    insertionInLL.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    int count = 0;
    boolean checkPallindrome = checkPallindrome(insertionInLL.head);
    System.out.println();
  }

  private static boolean checkPallindrome(Node head) {
    ImplementStackAsLL stack = new ImplementStackAsLL();
    Node headCopy = head;
    while (head != null) {
      stack.pushInStack(head.data);
      head = head.next;
    }
    while(headCopy != null){
      if(headCopy.data != stack.pop()){
        return false;
      }
      headCopy = headCopy.next;
    }
    return true;
  }
}
