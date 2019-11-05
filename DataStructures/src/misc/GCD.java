package misc;

// It is based on euclid's method or algorithm which suggest that you keep on dividing the two
// numbers(by reducing the larger number) till remainder becomes zero when remainder becomes zero
// return the divisor which is GCD
public class GCD {
  public static void main(String[] args) {
    int dividend = 13;
    int divisor = 4;

    System.out.println(gcd(dividend, divisor));
  }

    public static int gcd(int dividend, int divisor) {

    if (dividend % divisor == 0) {
      return divisor;
    }
    return gcd(divisor, dividend % divisor);
  }
}
