package binaryTree;

import java.util.Stack;

public class PreorderTraversalWithoutRecursion {
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
    PreorderTraversalWithoutRecursion insertionInLL = new PreorderTraversalWithoutRecursion();
    insertionInLL.head = head;
    insertionInLL.head.left = second;
    insertionInLL.head.right = third;
    second.left = fourth;
    second.right = fifth;
    inorderTraversalWithoutRecusrion(insertionInLL.head);
    System.out.println();
  }
  private static void inorderTraversalWithoutRecusrion(Node node) {
    Stack<Node> stack = new Stack<>();
    stack.push(node);

    while(stack.size() != 0){
      Node curr = stack.pop();
      System.out.println(curr.data);
      if(curr.right != null){
        stack.push(curr.right);
      }
      if(curr.left != null){
        stack.push(curr.left);
      }
    }
  }
}
