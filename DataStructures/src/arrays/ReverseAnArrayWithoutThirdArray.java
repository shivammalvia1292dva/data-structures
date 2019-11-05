package arrays;

//swap first and last term and so on..
public class ReverseAnArrayWithoutThirdArray {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    reverseArray(arr);
    System.out.println();
  }

  public static void reverseArray(int[] arr) {
    int startCounter = 0;
    int endCounter = arr.length - 1;
    while (startCounter < endCounter) {
      int temp = arr[startCounter];
      arr[startCounter] = arr[endCounter];
      arr[endCounter] = temp;
      startCounter++;
      endCounter--;
    }
  }
}
