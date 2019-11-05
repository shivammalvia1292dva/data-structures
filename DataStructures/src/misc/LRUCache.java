package misc;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

//refer to toher implementation of lru from geeks
public class LRUCache {

  Deque<Integer> deque = new LinkedList<>();
  HashSet<Integer> hashSet = new HashSet<>();
  int lruSize;

  LRUCache(int size) {
    lruSize = size;
  }

  void add(int element) {
    if (!deque.contains(element)) {
      if (hashSet.size() == lruSize) {
        int id = deque.removeLast();
        hashSet.remove(id);
      }
    } else {
      int index = 0;
      int i = 0;
      // if the element is there then you need to find it then remove it then add it again inthe
      // front
      Iterator<Integer> iterator = deque.iterator();
      while (iterator.hasNext()) {
        if (iterator.next() == element) {
          index = i;
        }
        i++;
      }
      deque.remove(index);
    }
    deque.push(element);
    hashSet.add(element);
  }

  public void display() {
    Iterator<Integer> itr = deque.iterator();
    while (itr.hasNext()) {
      System.out.print(itr.next() + " ");
    }
  }

  public static void main(String[] args) {
    LRUCache lru = new LRUCache(4);
    lru.add(1);
    lru.add(2);
    lru.add(3);
    lru.add(1);
    lru.add(4);
    lru.add(5);
    lru.display();
  }
}
