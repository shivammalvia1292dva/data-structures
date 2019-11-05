package binarySearchTree;

public class InsertionAndSearchAndDeleteionInBST {
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
    InsertionAndSearchAndDeleteionInBST traversal = new InsertionAndSearchAndDeleteionInBST();
    Node root = constructBst(preorder, 0, 5);
    int firstElement = 8;
    int secondElement = 25;

    insert(root, firstElement);
    insert(root, secondElement);

    boolean isPresent = search(root, 100);

    delete(root, firstElement);
    delete(root, secondElement);

    System.out.println(isPresent);
  }

  //this implementation is wrong
  private static boolean delete(Node root, int element) {
    if (root == null) {
      return false;
    }
    if (root.data == element) {
      return true;
    }
    if (element > root.data) {
      if (delete(root.right, element)) {
        Node successor = findInOrderSuccessor(root.right);
        root.right = successor;
        return false;
      }

    } else if (element < root.data) {
      if (delete(root.left, element)) {
        Node successor = findInOrderSuccessor(root.left);
        root.left = successor;
        return false;
      }
    }
    return false;
  }

  private static Node findInOrderSuccessor(Node element) {
    if (element.left == null) {
      return element.right;
    }
    return element.left;
  }

  private static boolean search(Node root, int element) {
    if (root == null) {
      return false;
    }
    if (root.data == element) {
      return true;
    }
    if (element > root.data) {
      return search(root.right, element);

    } else if (element < root.data) {
      return search(root.left, element);
    }
    return false;
  }

  // if root is null it means we have reached the point where node needs to be added
  private static Node insert(Node root, int element) {
    if (root == null) {
      return new Node(element);
    }
    if (element > root.data) {
      root.right = insert(root.right, element);

    } else {
      root.left = insert(root.left, element);
    }
    return root;
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
