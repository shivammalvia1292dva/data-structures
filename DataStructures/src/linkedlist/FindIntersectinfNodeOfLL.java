package linkedlist;

// substract smaller ll length from bigger then traverse both list for the differnce...now traverse
// both list simultaneously and compare the nodes....do not compare data but you need to compare the
// nodes for intersection
public class FindIntersectinfNodeOfLL {
  Node head;

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    Node second = new Node(7);
    Node third = new Node(8);
    Node fourth = new Node(11);
    Node fifth = new Node(12);
    Node sixth = new Node(20);
    FindIntersectinfNodeOfLL firstLL = new FindIntersectinfNodeOfLL();
    firstLL.head = head;
    firstLL.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;

    FindIntersectinfNodeOfLL secondLL = new FindIntersectinfNodeOfLL();
    secondLL.head = new Node(10);
    secondLL.head.next = fourth;

    int intersectionPoint = intersection(firstLL.head, secondLL.head);
    System.out.println();
  }

  private static int intersection(Node firstLL, Node secondLL) {
    int len1 = findLength(firstLL, 1);
    int len2 = findLength(secondLL, 1);
    int diff = len1 - len2;

    int counter = 0;
    while (counter != diff) {
      counter++;
      firstLL = firstLL.next;
    }
    while (firstLL.next != null) {
      if (firstLL == secondLL) {
        return firstLL.data;
      }
      firstLL = firstLL.next;
      secondLL = secondLL.next;
    }
    return 0;
  }

  private static int findLength(Node head, int count) {
    if (head == null) {
      return count;
    }
    head = head.next;
    count++;
    int finalCount = findLength(head, count);
    return finalCount;
  }
}
