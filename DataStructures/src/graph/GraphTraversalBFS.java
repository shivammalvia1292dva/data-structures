package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversalBFS {
  static Graph graph;

  static class Graph {
    int vertex;
    LinkedList<Integer>[] adjList;

    Graph(int v1) {
      vertex = v1;
      adjList = new LinkedList[v1];
      for (int i = 0; i < v1; i++) {
        adjList[i] = new LinkedList<>();
      }
    }
  }

  public static void main(String[] args) {
    GraphTraversalBFS graphTraversal = new GraphTraversalBFS();
    graphTraversal.graph = new Graph(5);
    graphTraversal.add(graph, 0, 1);
    graphTraversal.add(graph, 0, 4);
    graphTraversal.add(graph, 1, 2);
    graphTraversal.add(graph, 1, 3);
    graphTraversal.add(graph, 1, 4);
    graphTraversal.add(graph, 2, 3);
    graphTraversal.add(graph, 3, 4);
    System.out.println();
    doBFS(graph, 2);
    System.out.println();
    boolean[] visited = new boolean[graph.vertex];
    doDFS(graph, 2, visited);
  }

  private static void doDFS(Graph graph, int element, boolean[] visited) {
    visited[element] = true;
    System.out.println(element);
    Iterator<Integer> integerIterator = graph.adjList[element].listIterator();
    while (integerIterator.hasNext()) {
      int value = integerIterator.next();
      if (!visited[value]) {
        doDFS(graph, value, visited);
      }
    }
  }

  private static void doBFS(Graph graph, int source) {
    Queue<Integer> queue = new LinkedList<Integer>();
    boolean[] isVisited = new boolean[graph.vertex];
    isVisited[source] = true;
    queue.add(source);
    while (!queue.isEmpty()) {
      int value = queue.poll();
      System.out.println(value);
      Iterator<Integer> integerIterator = graph.adjList[value].listIterator();
      while (integerIterator.hasNext()) {
        int nextValue = integerIterator.next();
        if (!isVisited[nextValue]) {
          isVisited[nextValue] = true;
          queue.add(nextValue);
        }
      }
    }
  }

  private void add(Graph graph, int sourceVertex, int destinationVertex) {
    graph.adjList[sourceVertex].add(destinationVertex);
    graph.adjList[destinationVertex].add(sourceVertex);
  }
}
