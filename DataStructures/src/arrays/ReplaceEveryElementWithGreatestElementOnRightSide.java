package arrays;

public class ReplaceEveryElementWithGreatestElementOnRightSide {

  public static void main(String[] args) {
    int arr[] = {16, 17, 4, 3, 5, 2};
    replace(arr);
    System.out.println();
  }
  // last element needs to be -1 as it ws in the question and you need to replce the element with
  // the greatest element on the right side o we looped fromright side and maintained the maximum
  // element.
  private static void replace(int[] arr) {
    int maxFromRight = arr[arr.length - 1];
    arr[arr.length - 1] = -1;
    for (int i = arr.length - 2; i >= 0; i--) {
      int temp = arr[i];

      arr[i] = maxFromRight;

      if (temp > maxFromRight) {
        maxFromRight = temp;
      }
    }
  }
}
