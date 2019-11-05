package binaryTree;

//do inorder traersal it is ascending order by default for BST
public class KthMinFromTree {
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
    int[] preorder = {10, 5, 1, 7, 40, 50};
    KthMinFromTree tree = new KthMinFromTree();
    Node root = constructBst(preorder, 0, 5);
    System.out.println("do inorder traversal it is by default adcending order");
  }

  private static Node constructBst(int[] preorder, int start, int end) {
    if (start > end) {
      return null;
    }
    Node root = new Node(preorder[start]);
    if (start == end) {
      return root;
    }
    int index = findIndexOfGreaterElement(preorder, start, end, start);
    start++;
    root.left = constructBst(preorder, start, index - 1);
    root.right = constructBst(preorder, index, end);
    return root;
  }

  private static int findIndexOfGreaterElement(
      int[] preorder, int start, int end, int elementIndexToBeCheckedWith) {
    int i;
    for (i = start; i <= end; i++) {
      if (preorder[i] > preorder[elementIndexToBeCheckedWith]) {
        return i;
      }
    }
    return i;
  }
}
