package searching;

public class BinarySearch {

  public static void main(String[] args) {
    int arr[] = {1, 5, 8, 9, 11, 14, 16, 18};
    int elementToBeSearched = 16;
    int index = sortArr(arr, elementToBeSearched, 0, arr.length - 1);
    System.out.println(index);
  }

  private static int sortArr(int[] arr, int elementToBeSearched, int startIndex, int endIndex) {
    // start index needs to be added as consider if start index is 4 and end index is 7 so (7-4)/2 =
    // 1 which is not the mid so it needs to be added in sart index to find the mid
    int mid = startIndex + (endIndex - startIndex) / 2;
    int index = 0;

    if (arr[mid] == elementToBeSearched) {
      return mid;
    }
    if (arr[mid] > elementToBeSearched) {
      // mid-1 because mid is not required element so no need to send it again for iteration
      index = sortArr(arr, elementToBeSearched, startIndex, mid - 1);
    }
    if (arr[mid] < elementToBeSearched) {
      // mid+1 because mid is not required element so no need to send it again for iteration
      index = sortArr(arr, elementToBeSearched, mid + 1, endIndex);
    }
    return index;
  }
}
