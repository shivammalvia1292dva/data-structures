package misc;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
// the process is similar to convesion of binary to decimal
public class FindTheExcelColumnNumberFromString {
  static String input = "AAC";

  public static void main(String[] args) {
    double sum = 0;
    int count = 0;
    for (int i = input.length() - 1; i >= 0; i--) {
      sum = sum + (input.charAt(i) - 'A' + 1) * Math.pow(26, count);
      count++;
    }
    System.out.println(sum);
  }
}
