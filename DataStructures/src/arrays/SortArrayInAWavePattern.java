package arrays;

import java.util.Arrays;

// Two approaches...sort the array and replace adjacent position elements....second check if
// alternate position
// element is smaller then left element if not swap them..check for it on the right side and swap
// them too....
public class SortArrayInAWavePattern {
  public static void main(String[] args) {
    int arr[] = {10, 5, 6, 3, 2, 20, 100, 80};
    // sortArrayInAWave(arr);
    sortArrayInAWaveMoreEfficiently(arr);
    System.out.println();
  }

  // firs approach
  private static void sortArrayInAWave(int[] arr) {
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i = i + 2) {
      int temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = temp;
    }
  }
  // second approach if element is lesser then left swap them similaryly for right element.
  private static void sortArrayInAWaveMoreEfficiently(int[] arr) {
    for (int i = 1; i < arr.length - 1; i = i = i + 2) {
      if (arr[i] < arr[i - 1]) {
        int temp = arr[i];
        arr[i] = arr[i - 1];
        arr[i - 1] = temp;
      }
      if (arr[i] < arr[i + 1]) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }
  }
}
