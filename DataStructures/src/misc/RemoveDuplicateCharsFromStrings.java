package misc;

public class RemoveDuplicateCharsFromStrings {
  public static void main(String[] args) {
    String str = "aacvdsaaab";
    String result = "";
    for (int i = 0; i < str.length(); i++) {
      if (!result.contains(Character.toString(str.charAt(i)))) {
        result = result + Character.toString(str.charAt(i));
      }
    }
    System.out.println(result);
  }
  //for removal of duplicate words use linked hash set
}
