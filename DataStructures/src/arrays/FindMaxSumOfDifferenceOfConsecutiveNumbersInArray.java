package arrays;

public class FindMaxSumOfDifferenceOfConsecutiveNumbersInArray {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    maxConsecutiveSum(arr);
    System.out.println();
  }

  // the approach is to take a1,an-1,a2,an-2,a3,an-3...this would bring max sum...this sholud be
  // done after ascending order sorting and considering first number as (a1)
  private static void maxConsecutiveSum(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    int[] auxArray = new int[arr.length];
    int count = 0;
    while (start < end && count < arr.length - 1) {
      auxArray[count] = arr[start];
      count++;
      auxArray[count] = arr[end];
      count++;
      start++;
      end--;
    }
    if(start == end){
      auxArray[count] = arr[start];
    }
  }
}
