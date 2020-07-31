package arrays;

// treat 0 as -1 and 1 as 1 so keep on adding it it till the last time you get sum = 0
public class LargestSubArrayOfEqualZerosOnes {
  public static void main(String[] args) {
    int arr[] = {0, 0, 0, 0, 1, 1, 0, 1, 1};
    process(arr);
    System.out.println();
  }

  private static void process(int[] arr) {
    int sum = 0;
    int orignalMaxCount = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        sum = sum - 1;
      } else if (arr[i] == 1) {
        sum = sum + 1;
      }
      if (sum == 0 && i > orignalMaxCount) {
        orignalMaxCount = i;
      }
    }
    for (int i = 0; i <= orignalMaxCount; i++) {
      System.out.println(arr[i] + ",");
    }
  }
}
