package binaryTree;

public class MirrorTree {
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
    MirrorTree insertionInLL = new MirrorTree();
    insertionInLL.head = head;
    insertionInLL.head.left = second;
    insertionInLL.head.right = third;
    second.left = fourth;
    second.right = fifth;
    fourth.left = sixth;
    sixth.left = seventh;
    Node mirror = mirrorTree(insertionInLL.head);
    System.out.println();
  }

  private static Node mirrorTree(Node node) {
    if (node == null) {
      return null;
    }

    Node newNode = new Node(node.data);
    Node left = mirrorTree(node.left);
    Node right = mirrorTree(node.right);
    newNode.left = right;
    newNode.right = left;

    return newNode;
  }
}
