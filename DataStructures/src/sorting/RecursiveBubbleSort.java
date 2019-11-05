package sorting;

public class RecursiveBubbleSort {

  public static void main(String[] args) {
    int arr[] = {20, 5, 80, 9, 14, 19, 21, 18};
    recursiveSortArr(arr, arr.length);
    System.out.println();
  }

  private static void recursiveSortArr(int[] arr, int length) {
    if (length <= 0) {
      return;
    }
    for (int i = 0; i < length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }
    recursiveSortArr(arr, length - 1);
  }
}
