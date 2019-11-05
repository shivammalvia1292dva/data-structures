package arrays;

public class AlternateNegativeAndPositivenumbers {

  public static void main(String[] args) {
    int arr[] = {-10, -2, 3, -20, 4, 5, -60, 7, -18};
    int index = seperateNegativeAndPositive(arr, arr.length);
    mixPositiveAndNegativeNumbers(arr, index);
    System.out.println();
  }

  private static void mixPositiveAndNegativeNumbers(int[] arr, int differentiatingIndex) {
    int count1 = 0;
    int count2 = differentiatingIndex;
    // First condition is used when we go ahead of diffrentiating index....in the positive side when
    // we are swapping elements...
    while (count2 < arr.length && count1 < count2 && arr[count1] < 0) {
      int temp = arr[count1];
      arr[count1] = arr[count2];
      arr[count2] = temp;
      count1 = count1 + 2;
      count2++;
    }
  }

  private static int seperateNegativeAndPositive(int[] arr, int length) {
    int i = -1;
    int pivot = 0;
    for (int j = 0; j < length; j++) {
      if (pivot > arr[j]) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    return i + 1;
  }
}
