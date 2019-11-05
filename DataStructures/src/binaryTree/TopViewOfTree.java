package binaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// add vertical distance as well while vertical order traversing if the new node encountered has
// sall vertical distance put it inside map by replcaing the original entry otherise do nothing
public class TopViewOfTree {
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

  static class HelPerClass {
    int verticalDistance;
    int data;

    HelPerClass(int data, int verticalDistance) {
      this.verticalDistance = verticalDistance;
      this.data = data;
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
    TopViewOfTree insertionInLL = new TopViewOfTree();
    insertionInLL.head = head;
    insertionInLL.head.left = second;
    insertionInLL.head.right = third;
    second.left = fourth;
    second.right = fifth;
    third.left = sixth;
    third.right = seventh;
    seventh.right = ninth;
    sixth.right = eight;

    Map<Integer, HelPerClass> map = new HashMap<>();
    int verticalDistance = 0;
    int horizontalDistance = 0;
    topView(insertionInLL.head, map, horizontalDistance, verticalDistance);
    System.out.println(map);
  }

  private static void topView(
      Node node, Map<Integer, HelPerClass> map, int horizontalDistance, int verticalDistance) {
    if (map.get(horizontalDistance) == null) {
      map.put(horizontalDistance, new HelPerClass(node.data, verticalDistance));
    } else {

      HelPerClass helper = map.get(horizontalDistance);
      if (helper.verticalDistance > verticalDistance) {
        map.put(horizontalDistance, new HelPerClass(node.data, verticalDistance));
      }
    }
    if (node.left != null) {
      topView(node.left, map, horizontalDistance - 1, verticalDistance + 1);
    }
    if (node.right != null) {
      topView(node.right, map, horizontalDistance + 1, verticalDistance + 1);
    }
  }
}
