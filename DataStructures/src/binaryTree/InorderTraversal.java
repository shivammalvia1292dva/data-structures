package binaryTree;

// in this traversal you need to traverse first left root then right
public class InorderTraversal {
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
    InorderTraversal insertionInLL = new InorderTraversal();
    insertionInLL.head = head;
    insertionInLL.head.left = second;
    insertionInLL.head.right = third;
    second.left = fourth;
    second.right = fifth;
    inorderTraversal(insertionInLL.head);
    System.out.println();
  }

  private static void inorderTraversal(Node node) {
    if(node.left != null){
      inorderTraversal(node.left);
    }
    System.out.println(node.data);
    if(node.right != null){
      inorderTraversal(node.right);
    }
  }
}
