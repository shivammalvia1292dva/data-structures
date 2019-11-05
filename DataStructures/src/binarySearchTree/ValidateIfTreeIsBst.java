package binarySearchTree;

//this is wrong implementation
public class ValidateIfTreeIsBst {
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
    ValidateIfTreeIsBst traversal = new ValidateIfTreeIsBst();
    Node root = constructBst(preorder, 0, 5);

    boolean flag = validate(root);
    System.out.println(flag);
  }

  private static boolean validate(Node root) {
    if (root == null) {
      return true;
    }
    if (root.left != null) {
      if (root.data > root.left.data) {
        return validate(root.left);
      } else {
        return false;
      }
    } else if (root.left == null) {
      return true;
    }
    if (root.right != null) {
      if (root.data < root.right.data) {
        return validate(root.right);
      } else {
        return false;
      }
    } else if (root.right == null) {
      return true;
    }
    return false;
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
