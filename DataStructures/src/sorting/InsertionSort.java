package sorting;

public class InsertionSort {

  public static void main(String[] args) {
    int arr[] = {20, 5, 80, 9, 14, 19, 21, 18};
    insertionSortArr(arr, arr.length);
    System.out.println();
  }

  // one array of sorted elements is maintained and you need to compare one elemtn with the entire
  // sroted array to find it's position and in the due course keep on switching adjacent numbers
  private static void insertionSortArr(int[] arr, int length) {
    int key;
    int j = 0;
    for (int i = 1; i < length; i++) {
      key = arr[i];
      j = i - 1;

      while (j >= 0 && key < arr[j]) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
  }
}
