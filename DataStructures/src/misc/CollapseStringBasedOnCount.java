package misc;

public class CollapseStringBasedOnCount {
  public static void main(String args[]) {
    String str = "aaabbcdde";
    String out = "";
    char tempChar = str.charAt(0);
    int count = 1;
    for (int i = 1; i < str.length(); i++) {
      if (tempChar == str.charAt(i)) {
        count++;
      } else {
        out = out + String.valueOf(tempChar) + count;
        tempChar = str.charAt(i);
        count = 1;
      }
    }
    out = out + String.valueOf(tempChar) + count;
    System.out.println(out);
  }
}
