package arrays;

public class SegregateEvenNumbersFromArray {
  public static void main(String[] args) {
    int arr[] = {1, 3, 5, 6, 7, 9};
    int arr1[] = {1, 0, 0, 0, 1, 0};
    segregateEvenOddNumbers(arr);
    //can be used for both zero and one used the below quick sort partition teechnique as it is easier
    segregateEvenOddNumbersByQuickSort(arr1);
    System.out.println();
  }

  // by using two pointers one at start ans other at end
  private static void segregateEvenOddNumbers(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        while (end > i) {
          if (arr[end] % 2 == 0) {
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end--;
            break;
          }
          end--;
        }
      }
    }
  }

  // by using quick sort partition tehnique
  private static void segregateEvenOddNumbersByQuickSort(int[] arr) {
    int i = -1;
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] == 0) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
  }
}
