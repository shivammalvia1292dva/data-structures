package arrays;

import static misc.GCD.gcd;
// very complicated algorithm refer geeks for geeks video on geeks page itself
public class RotateArrayJugglaryMethod {
  public static void main(String[] args) {
    RotateArrayJugglaryMethod rotate = new RotateArrayJugglaryMethod();
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    int rotateBy = 2;
    rotate.leftRotate(arr, rotateBy, arr.length);
    System.out.println();
  }

  static void leftRotate(int arr[], int d, int n) {
    int i, j, k, temp;
    int g_c_d = gcd(d, n);
    for (i = 0; i < g_c_d; i++) {
      /* move i-th values of blocks */
      temp = arr[i];
      j = i;
      while (true) {
        k = j + d;
        if (k >= n) k = k - n;
        if (k == i) break;
        arr[j] = arr[k];
        j = k;
      }
      arr[j] = temp;
    }
  }
}
