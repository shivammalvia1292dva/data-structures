package misc;

import java.util.HashMap;
import java.util.Map;

// the process is similar to convesion of binary to decimal
public class FindTheExcelStringFromExcelColumnNumber {
  static int input = 705;

  public static void main(String[] args) {
    String output = "";
    while (true) {
      if (input == 0) {
        break;
      }
      int remainder = input % 26;
      char charValue = (char) (remainder - 1 + 'A');
      output = charValue + output;
      input = input / 26;
    }
    System.out.println(output);
  }
}
