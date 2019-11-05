package arrays;

public class MaxMinFormArray {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    maxminFormArray(arr);
    System.out.println();
  }

  private static void maxminFormArray(int[] arr) {
    ReverseAnArrayWithoutThirdArray.reverseArray(arr);
    int[] arrAux = new int[arr.length];
    int start = 0;
    int count = 0;
    int end = arr.length - 1;
    while (start < end) {
      arrAux[count] = arr[start];
      count++;
      arrAux[count] = arr[end];
      count++;
      start++;
      end--;
    }
    if (start == end) {
      arrAux[count] = arr[start];
    }
    System.out.println(arrAux);
  }
}
