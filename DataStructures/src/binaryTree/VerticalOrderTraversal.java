package binaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//very wasy map me dalte jao ot traverse karte jao...easy
public class VerticalOrderTraversal {
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
    Node ninth = new Node(9);
    VerticalOrderTraversal insertionInLL = new VerticalOrderTraversal();
    insertionInLL.head = head;
    insertionInLL.head.left = second;
    insertionInLL.head.right = third;
    second.left = fourth;
    second.right = fifth;
    third.left = sixth;
    third.right = seventh;
    seventh.right = ninth;
    sixth.right = eight;

    Map<Integer, List<Integer>> map = new HashMap<>();
    int distance = 0;
    verticalTraversal(insertionInLL.head, map, distance);
    System.out.println(map);
  }

  private static void verticalTraversal(Node node, Map<Integer, List<Integer>> map, int distance) {
    if (map.get(distance) == null) {
      List<Integer> list = new ArrayList<>();
      list.add(node.data);
      map.put(distance, list);
    } else {
      map.get(distance).add(node.data);
    }
    if (node.left != null) {
      verticalTraversal(node.left, map, distance - 1);
    }
    if (node.right != null) {
      verticalTraversal(node.right, map, distance + 1);
    }
  }
}
