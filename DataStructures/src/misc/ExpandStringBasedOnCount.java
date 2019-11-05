package misc;

import java.util.HashSet;
import java.util.Set;

public class ExpandStringBasedOnCount {
  public static void main(String args[]) {
    String str = "a3b2c5";
    String result = "";
    String temp;
    int count = 0;
    for (int i = 0; i < str.length();) {
      temp = "";
      count = 0;
      temp = str.charAt(i) + "";
      i++;
      count = Integer.parseInt(str.charAt(i) + "");
      i++;
      for(int j = 0;j<count;j++){
          result = result+temp;
      }
    }
    System.out.println(result);
  }
}
