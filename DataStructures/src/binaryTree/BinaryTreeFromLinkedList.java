package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeFromLinkedList {
  static Node head;

  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.add(10);
    linkedList.add(12);
    linkedList.add(15);
    linkedList.add(25);
    linkedList.add(30);
    linkedList.add(36);

    generateTree(linkedList);
    // check head
    System.out.println();
  }
  // Important thing to note is that the element you add in queue has to be the object of node class
  // means your binary tree object...now ehen you pop one from queue you get binary tree object
  // itself so when you add left and right to it from Linked list it attaches itself.
  private static void generateTree(LinkedList<Integer> linkedList) {
    Node node = new Node(linkedList.pop());
    Queue<Node> queue = new LinkedList<>();
    queue.add(node);
    while (!queue.isEmpty()) {
      Node element = queue.poll();

      if (!linkedList.isEmpty()) {
        Node leftChild = new Node(linkedList.poll());
        element.left = leftChild;
        queue.add(leftChild);
      }
      if (!linkedList.isEmpty()) {
        Node rightChild = new Node(linkedList.poll());
        element.right = rightChild;
        queue.add(rightChild);
      }
    }
    System.out.println();
  }
}
