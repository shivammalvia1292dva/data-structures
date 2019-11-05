package arrays;

// quite complicated logic where you keep track of the index of the element smaller then current
// element in the smaller array and vice versa for greater array.
// then if you get a element which is on the left side and smaller then current element then we
// store it's index in the smaller array ....similar in greater array
public class SubSequenceOfSize3 {
  public static void main(String[] args) {
    int arr[] = {12, 11, 10, 5, 6, 2, 30};
    findSubsequence(arr);
    System.out.println();
  }

  private static void findSubsequence(int[] arr) {
    int min = 0;
    int max = arr.length - 1;
    int[] smaller = new int[arr.length];
    int[] greater = new int[arr.length];
    smaller[0] = -1;
    greater[arr.length - 1] = -1;
    for (int i = 1; i < arr.length - 1; i++) {
      if (arr[i] < arr[min]) {
        min = i;
        smaller[i] = -1;
      } else {
        smaller[i] = min;
      }
    }
    for (int i = arr.length - 2; i > 0; i--) {
      if (arr[max] < arr[i]) {
        max = i;
        greater[i] = -1;
      } else {
        greater[i] = max;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (smaller[i] != -1 && greater[i] != -1) {
        System.out.println(arr[smaller[i]]);
        System.out.println(arr[i]);
        System.out.println(arr[greater[i]]);
      }
    }
  }
}
