package misc;

import java.util.HashSet;
import java.util.Set;

public class FindDistinctYearInAString {
  public static void main(String args[]) {
    String str = "UN was established on 24-10-1945.India got freedom on 15-08-1947.";
    String[] arr = str.split(" ");
    Set<String> set = new HashSet<>();
    for(int i = 0;i<arr.length;i++){
        if(Character.isDigit(arr[i].charAt(0))){
            int index = arr[i].lastIndexOf('-');
            set.add(arr[i].substring(index+1,index+5));
        }
    }
    System.out.println(set.size());
  }
}
