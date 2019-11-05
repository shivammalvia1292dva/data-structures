package sorting;

public class BubbleSort {

  public static void main(String[] args) {
    int arr[] = {5, 10, 8, 9, 6};
    bubbleSortArrOptimize(arr, arr.length);
    System.out.println();
  }
  // this approach is not at all good...do not use it..
  private static void bubbleSortArr(int[] arr, int length) {
    for (int i = 0; i < length; i++) {
      for (int j = i + 1; j < length; j++) {
        if (arr[j] < arr[i]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
  // this approach is optimized as it used swap variable which breaks if now swap happens  best case
  // complexity is o(n)
  private static void bubbleSortArrOptimize(int[] arr, int length) {
    boolean swapped = false;
    for (int i = 0; i < length; i++) {
      swapped = false;
      for (int j = 0; j < length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;
        }
      }
      // IF no two elements were swapped by inner loop, then break
      if (swapped == false) break;
    }
  }
}
