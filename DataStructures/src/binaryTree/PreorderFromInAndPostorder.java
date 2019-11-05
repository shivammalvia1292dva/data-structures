package binaryTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// just opposite of constructing post order traverssal from inorder and preorder only important
// thing is in postorder the last element in post order is root element
public class PreorderFromInAndPostorder {
  static int postIndex = 5;

  public static void main(String[] args) {
    int[] inorder = {4, 2, 5, 1, 3, 6};
    int[] postorder = {4, 5, 2, 6, 3, 1};
    // 1,2,4,5,3,6

    Stack<Integer> stack = new Stack<>();

    Map<Integer, Integer> mapOfInOrderTraversal = new HashMap<>();
    for (int i = 0; i < inorder.length; i++) {
      mapOfInOrderTraversal.put(inorder[i], i);
    }
    int postIndex = postorder.length - 1;
    generatePostorder(inorder, postorder, 0, postorder.length - 1, mapOfInOrderTraversal, stack);
    System.out.println();
  }

  private static void generatePostorder(
      int[] inorder,
      int[] postorder,
      int start,
      int end,
      Map<Integer, Integer> mapOfInOrderTraversal,
      Stack stack) {
    if (start > end) {
      return;
    }
    int index = mapOfInOrderTraversal.get(postorder[postIndex--]);

    generatePostorder(inorder, postorder, index + 1, end, mapOfInOrderTraversal, stack);
    generatePostorder(inorder, postorder, start, index - 1, mapOfInOrderTraversal, stack);
    stack.push(inorder[index]);
  }
}
