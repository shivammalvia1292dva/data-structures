package sorting;

public class RecursiveSelectionSort {

  public static void main(String[] args) {
    int arr[] = {20, 5, 80, 9, 14, 19, 21, 18};
    selectionSortArr(arr, arr.length);
    System.out.println();
  }
  // first only find the index and then swap at the last...element swapped are the greatest element
  // and the last element in the array. the last element is the one which is set in each iteration
  // with length - 1 till it reaches zero.
  private static void selectionSortArr(int[] arr, int length) {
    if (length <= 0) {
      return;
    }
    int largestIndex = 0;
    for (int i = 0; i < length - 1; i++) {
      if (arr[i] > arr[largestIndex]) {
        largestIndex = i;
      }
    }
    int temp = arr[largestIndex];
    arr[largestIndex] = arr[length - 1];
    arr[length - 1] = temp;
    selectionSortArr(arr, length - 1);
  }
}
