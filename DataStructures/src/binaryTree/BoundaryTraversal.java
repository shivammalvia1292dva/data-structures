package binaryTree;

// this is divided into three pathrs first traveser only leaves then traverse all left nodes and
// print them but remember once there are no left nodes you need to move to the right node of that
// left node becasue it can also be a boundary similary for right sub tree as well
public class BoundaryTraversal {
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
    Node eight = new Node(8);
    BoundaryTraversal insertionInLL = new BoundaryTraversal();
    insertionInLL.head = head;
    insertionInLL.head.left = second;
    insertionInLL.head.right = third;
    second.left = fourth;
    second.right = fifth;
    fourth.left = sixth;
    sixth.left = seventh;
    seventh.right = eight;
    travelLeftSubtree(insertionInLL.head);
    System.out.println();
    travelLeaves(insertionInLL.head);
    System.out.println();
    travelRightSubtree(insertionInLL.head.right);
  }

  private static void travelLeaves(Node node) {
    if (node.left != null) {
      travelLeaves(node.left);
    }
    if (node.right != null) {
      travelLeaves(node.right);
    }
    if (node.left == null && node.right == null) {
      System.out.println(node.data);
    }
  }

  private static void travelRightSubtree(Node node) {
    if (node.right != null) {
      System.out.println(node.data);
      travelRightSubtree(node.right);
    }
    if (node.left != null) {
      System.out.println(node.data);
      travelRightSubtree(node.left);
    }
  }

  private static void travelLeftSubtree(Node node) {
    if (node.left != null) {
      System.out.println(node.data);
      travelLeftSubtree(node.left);
    }
    if (node.right != null) {
      System.out.println(node.data);
      travelLeftSubtree(node.right);
    }
  }
}
