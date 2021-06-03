class ReadExcelFromURL {

  public static void main(String[] args) throws Exception {
    int[] arr = {1, 5, 0, 10, 16, 6};
    int min = 0;
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
        if(i == 0){
            min = arr[i];
            max = arr[i];
            continue;
        }
        if(arr[i] > max){
            max = arr[i];
        }
        if(arr[i] < min){
            min = arr[i];
        }
    }
    System.out.println(max);
    System.out.println(min);
  }
}
