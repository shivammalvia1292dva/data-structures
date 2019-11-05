package binaryTree;

import java.util.HashMap;
import java.util.Map;

// preorder ka pehle inorder me dhundo uske left wala laft tree hai and right wala right tree hai
// aisa recursively karo sith start > end condition most important
public class PostorderFromInAndPreorder {
  static int pre = 0;

  public static void main(String[] args) {
    int[] inorder = {4, 2, 5, 1, 3, 6};
    int[] preorder = {1, 2, 4, 5, 3, 6};

    Map<Integer, Integer> mapOfInOrderTraversal = new HashMap<>();
    for (int i = 0; i < inorder.length; i++) {
      mapOfInOrderTraversal.put(inorder[i], i);
    }
    generatePostorder(inorder, preorder, 0, preorder.length - 1, mapOfInOrderTraversal);
  }

  private static void generatePostorder(
      int[] inorder,
      int[] preorder,
      int start,
      int end,
      Map<Integer, Integer> mapOfInOrderTraversal) {
    if (start > end) {
      return;
    }
    int index = mapOfInOrderTraversal.get(preorder[pre++]);
    generatePostorder(inorder, preorder, start, index - 1, mapOfInOrderTraversal);
    generatePostorder(inorder, preorder, index + 1, end, mapOfInOrderTraversal);
    System.out.println(inorder[index]);
  }
}
