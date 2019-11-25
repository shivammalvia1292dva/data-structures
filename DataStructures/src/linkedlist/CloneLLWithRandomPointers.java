package linkedlist;

public class CloneLLWithRandomPointers {
  Node head;

  static class Node {
    int data;
    Node nextOne;
    Node nextTwo;

    Node(int data) {
      this.data = data;
      this.nextOne = null;
      this.nextTwo = null;
    }
  }

  public static void main(String[] args) {
    CloneLLWithRandomPointers clone = new CloneLLWithRandomPointers();
    Node first = new Node(1);
    clone.head = first;
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);
    Node fifth = new Node(5);
    first.nextOne = second;
    second.nextOne = third;
    third.nextOne = fourth;
    fourth.nextOne = fifth;

    second.nextTwo = first;
    first.nextTwo = third;
    third.nextTwo = fifth;
    fourth.nextTwo = fifth;
    fifth.nextTwo = second;
    Node temp = first;
    Node clonedLinkedList = clone.cloneLinkedList(temp);
    clone.addSecondPointer(temp, clonedLinkedList);
    System.out.println();
  }

  private void addSecondPointer(Node temp, Node clonedLinkedList) {
    while (clonedLinkedList != null) {
      clonedLinkedList.nextTwo = findNextTwo(head, temp.nextTwo);
      clonedLinkedList = clonedLinkedList.nextOne;
    }
  }

  private Node cloneLinkedList(Node curr) {
    if (curr == null) {
      return null;
    }
    Node newNode = new Node(curr.data);
    newNode.nextOne = cloneLinkedList(curr.nextOne);
    return newNode;
  }

  private static Node findNextTwo(Node head, Node nextTwo) {
    while (head != null) {
      if (nextTwo == head) {
        return nextTwo;
      }
      head = head.nextOne;
    }
    return null;
  }
}
