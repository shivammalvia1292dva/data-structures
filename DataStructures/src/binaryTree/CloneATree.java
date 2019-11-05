package binaryTree;

public class CloneATree {
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
    CloneATree insertionInLL = new CloneATree();
    CloneATree cloned = new CloneATree();
    insertionInLL.head = head;
    insertionInLL.head.left = second;
    insertionInLL.head.right = third;
    second.left = fourth;
    second.right = fifth;
    fourth.left = sixth;
    sixth.left = seventh;
    cloneTree(insertionInLL.head);
    System.out.println();
  }

  private static Node cloneTree(Node node) {
    if (node == null) {
      return null;
    }

    Node clonedNode = new Node(node.data);
    clonedNode.left = cloneTree(node.left);
    clonedNode.right = cloneTree(node.right);

    return clonedNode;
  }
}
