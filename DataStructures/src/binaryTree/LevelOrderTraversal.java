package binaryTree;

public class LevelOrderTraversal {
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
    LevelOrderTraversal insertionInLL = new LevelOrderTraversal();
    insertionInLL.head = head;
    insertionInLL.head.left = second;
    insertionInLL.head.right = third;
    second.left = fourth;
    second.right = fifth;
    fourth.left = sixth;
    sixth.left = seventh;
    int height = heightOfTree(insertionInLL.head);
    for (int i = 1; i <= height; i++) {
      levelOrderTraversal(insertionInLL.head, i);
      System.out.println();
    }
  }

  private static void levelOrderTraversal(Node node, int i) {
    if (node == null) {
      return;
    }
    if (i == 1) {
      System.out.print(node.data);
    } else if (i > 1) {
      levelOrderTraversal(node.left, i - 1);
      levelOrderTraversal(node.right, i - 1);
    }
  }

  // +1 is added in lheight or rheight for the current node
  private static int heightOfTree(Node node) {
    if (node == null) {
      return 0;
    }
    int lheight = heightOfTree(node.left);
    int rheight = heightOfTree(node.right);
    if (lheight > rheight) {
      return lheight + 1;
    } else {
      return rheight + 1;
    }
  }
}
