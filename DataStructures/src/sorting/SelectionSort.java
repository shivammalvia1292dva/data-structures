package sorting;

public class SelectionSort {

  public static void main(String[] args) {
    int arr[] = {20, 5, 80, 9, 14, 19, 21, 18};
    selectionSortArr(arr);
    System.out.println();
  }

  private static void selectionSortArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int smallestIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[smallestIndex]) {
          smallestIndex = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[smallestIndex];
      arr[smallestIndex] = temp;
    }
  }
}
