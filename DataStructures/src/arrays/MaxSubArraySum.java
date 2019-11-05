package arrays;

public class MaxSubArraySum {

  public static void main(String[] args) {
    int arr[] = {2, 3, 4, 5, 7};
    int sum = maxSubArraySum(arr);
    System.out.println();
  }

  // very simple logic add numbers in a bubble sort fashion and find the max you need to reset the
  // sum to 0 again to dump the old sum and start a fresh
  private static int maxSubArraySum(int[] arr) {
    int existingMaxSum = 0;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = 0;
      sum = sum + arr[i];
      for (int j = i + 1; j < arr.length; j++) {
        sum = sum + arr[j];
        if (sum > existingMaxSum) {
          existingMaxSum = sum;
        }
      }
    }
    return existingMaxSum;
  }
}
