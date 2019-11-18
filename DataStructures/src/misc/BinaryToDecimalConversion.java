package misc;

public class BinaryToDecimalConversion {
  public static void main(String[] args) {
    int binary = 11111;
    int num = 0;
    int count = 0;
    while (binary != 0) {
      int remainder = binary % 10;
      num = num + (int) (remainder * (Math.pow(2, count)));
      binary = binary / 10;
      count++;
    }
    System.out.println(num);
  }
}
