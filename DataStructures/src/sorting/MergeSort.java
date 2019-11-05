package sorting;

import java.util.Stack;

public class MergeSort {

  public static void main(String[] args) {
    int arr[] = {20, 5, 80, 9, 14, 19, 21, 18};
    mergeSortArr(arr, 0, arr.length - 1);
    System.out.println();
  }

  private static void mergeSortArr(int[] arr, int start, int end) {
    if (start < end) {
      int mid = start + (end - start) / 2;

      mergeSortArr(arr, start, mid);
      mergeSortArr(arr, mid + 1, end);

      merge(arr, start, mid, end);
      System.out.println();
    }
  }

  private static void merge(int[] arr, int start, int mid, int end) {
    int[] arrleft = new int[mid + 1 - start];
    int[] arrright = new int[end - mid];

    int[] left = new int[mid - start + 1];
    int[] right = new int[end - mid];

    for (int i = 0; i < (mid - start) + 1; i++) {
      left[i] = arr[i + start];
    }
    for (int j = 0; j < (end - mid); j++) {
      right[j] = arr[j + mid + 1];
    }
    int count1 = 0;
    int count2 = 0;
    while (count1 < left.length && count2 < right.length) {
      if (left[count1] < right[count2]) {
        arr[start] = left[count1];
        start++;
        count1++;
      } else {
        arr[start] = right[count2];
        start++;
        count2++;
      }
    }
    while (count1 < left.length) {
      arr[start] = left[count1];
      start++;
      count1++;
    }
    while (count2 < right.length) {
      arr[start] = right[count2];
      start++;
      count2++;
    }
  }
}
