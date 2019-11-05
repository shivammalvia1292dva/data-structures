package misc;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
//not working but you got the idea
public class AlternateEvenOddInSortedWay {
  public static void main(String args[]) {
    int[] arr = {10, 3, 5, 9, 7, 13, 4, 6, 14, 16};
    Arrays.sort(arr);
    Stack<Integer> list1 = new Stack<>();
    Stack<Integer> list2 = new Stack<>();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        list1.push(arr[i]);
      } else {
        list2.push(arr[i]);
      }
    }
    Collections.sort(list1);
    Collections.sort(list2);

    int count = 0;
    if(!list1.isEmpty()&& !list2.isEmpty()){
      if(list1.peek() < list2.peek()){
        arr[count] = list1.pop();
      }else{
        arr[count] = list2.pop();
      }
      count ++;
    }
    System.out.println(arr);
  }
}
