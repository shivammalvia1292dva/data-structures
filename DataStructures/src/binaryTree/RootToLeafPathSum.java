package binaryTree;

public class RootToLeafPathSum {
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
    RootToLeafPathSum insertionInLL = new RootToLeafPathSum();
    insertionInLL.head = head;
    insertionInLL.head.left = second;
    insertionInLL.head.right = third;
    second.left = fourth;
    second.right = fifth;
    fourth.left = sixth;
    sixth.left = seventh;
    int sumExpected = 21;
    int sumActual = 0;
    boolean isSumEqual = checkSum(insertionInLL.head, sumExpected, sumActual);
    System.out.println(isSumEqual);
  }

  private static boolean checkSum(Node node, int sumExpected, int sumActual) {
    boolean leftCheck = false;
    boolean rightCheck = false;
    if (node == null) {
      return false;
    }
    if (sumExpected == (sumActual + node.data) && node.left == null && node.right == null) {
      return true;
    }
    if (node.left != null) {
      leftCheck = checkSum(node.left, sumExpected, sumActual + node.data);
    }
    if (node.right != null) {
      rightCheck = checkSum(node.right, sumExpected, sumActual + node.data);
    }
    if (leftCheck || rightCheck) {
      return true;
    }
    return false;
  }
}
