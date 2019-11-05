package binaryTree;

import java.util.Stack;

public class InorderTraversalWithoutRecursion {
  Node head;

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
    Node head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);
    Node fifth = new Node(5);
    Node sixth = new Node(6);
    Node seventh = new Node(7);
    InorderTraversalWithoutRecursion insertionInLL = new InorderTraversalWithoutRecursion();
    insertionInLL.head = head;
    insertionInLL.head.left = second;
    insertionInLL.head.right = third;
    second.left = fourth;
    second.right = fifth;
    inorderTraversalWithoutRecusrion(insertionInLL.head);
    System.out.println();
  }
  // push element in a stack till left !+ null then pop element and assign it tto current pointer
  // now check if there exist right of current if yes we again loop till we reach left null if this
  // is not the case we pop from stack
  private static void inorderTraversalWithoutRecusrion(Node node) {
    Stack<Node> stack = new Stack<>();
    Node curr = node;
    while (curr != null || stack.size() >0) {
      while (curr != null) {
        stack.push(curr);
        curr = curr.left;
      }
      curr = stack.pop();
      System.out.println(curr.data);
      curr = curr.right;
    }
  }
}
