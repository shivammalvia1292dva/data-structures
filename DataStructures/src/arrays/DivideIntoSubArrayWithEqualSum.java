package arrays;

// first sort in ascending order divide the array into two sub arrays which have equal sum and print them
// use two pointers which maintains start sum and sum and add numbers from the start in the add sum
// if it is less then from the end sum then add arr[i] to it other wise add data to  end sum
// break loop when end -1 becomes equal to start
public class DivideIntoSubArrayWithEqualSum {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 9};
    process(arr);
    System.out.println();
  }

  private static void process(int[] arr) {
    int sum = 0;
    int start = 0;
    int end = arr.length - 1;
    int startSum = arr[start];
    int endSum = arr[arr.length - 1];
    while (start < end) {
      if (startSum < endSum) {
        start++;
        startSum = startSum + arr[start];
      } else if (startSum > endSum) {
        end--;
        endSum = endSum + arr[end];
      } else if (end - 1 == start && startSum == endSum) {
        System.out.println("first location : " + "0" + " end : " + start);
        System.out.println("second location : " + end + " end : " + (arr.length - 1));
        break;
      }
    }
  }
}
