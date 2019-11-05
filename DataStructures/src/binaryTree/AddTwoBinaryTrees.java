package binaryTree;

public class AddTwoBinaryTrees {
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
    AddTwoBinaryTrees insertionInLL = new AddTwoBinaryTrees();
    insertionInLL.head = head;
    insertionInLL.head.left = second;
    insertionInLL.head.right = third;
    second.left = fourth;
    second.right = fifth;
    fourth.left = sixth;
    sixth.left = seventh;
    AddTwoBinaryTrees cloned = new AddTwoBinaryTrees();
    Node head2 = new Node(1);
    Node second2 = new Node(2);
    Node third2 = new Node(3);
    Node fourth2 = new Node(4);
    Node fifth2 = new Node(5);
    Node sixth2 = new Node(6);
    Node seventh2 = new Node(7);
    cloned.head = head2;
    cloned.head.left = second2;
    cloned.head.right = third2;
    second2.left = fourth2;
    second2.right = fifth2;
    fourth2.left = sixth2;
    sixth2.left = seventh2;

    Node add = addTwoTrees(insertionInLL.head, cloned.head);
    System.out.println();
  }

  private static Node addTwoTrees(Node head1, Node head2) {
    if (head1 == null) {
      return head2;
    }
    if (head2 == null) {
      return head1;
    }
    Node head3 = new Node(head1.data + head2.data);
    head3.left = addTwoTrees(head1.left, head2.left);
    head3.right = addTwoTrees(head1.right, head2.right);
    return head3;
  }
}
