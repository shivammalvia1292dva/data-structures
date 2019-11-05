package sorting;

public class QuickSort {

  public static void main(String[] args) {
    int arr[] = {20, 5, 80, 9, 14, 19, 21, 18};
    quickSortArr(arr, 0, arr.length-1);
    System.out.println();
  }

  private static void quickSortArr(int[] arr, int start, int end) {
    if (start < end) {
      int mid = findPartition(arr, start, end);
      quickSortArr(arr, start, mid - 1);
      quickSortArr(arr, mid + 1, end);
    }
  }

  private static int findPartition(int[] arr, int start, int end) {
    int i = start - 1;
    int pivot = arr[end];
    for (int j = start; j < end; j++) {
      if (pivot > arr[j]) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[end];
    arr[end] = arr[i + 1];
    arr[i + 1] = temp;

    return i + 1;
  }
}
