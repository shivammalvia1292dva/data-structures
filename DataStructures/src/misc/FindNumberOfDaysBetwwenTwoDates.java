package misc;

import java.util.HashMap;
import java.util.Map;

public class FindNumberOfDaysBetwwenTwoDates {
  public static void main(String args[]) {
    int d1 = 25;
    int m1 = 1;
    int y1 = 1992;

    int d2 = 12;
    int m2 = 9;
    int y2 = 1992;

    Map<Integer, Integer> nonLeapYearMap = new HashMap<>();
    nonLeapYearMap.put(1, 31);
    nonLeapYearMap.put(2, 28);
    nonLeapYearMap.put(3, 31);
    nonLeapYearMap.put(4, 30);
    nonLeapYearMap.put(5, 31);
    nonLeapYearMap.put(6, 30);
    nonLeapYearMap.put(7, 31);
    nonLeapYearMap.put(8, 31);
    nonLeapYearMap.put(9, 30);
    nonLeapYearMap.put(10, 31);
    nonLeapYearMap.put(11, 30);
    nonLeapYearMap.put(12, 31);

    int totaDays = 0;
    // first number of days for yearzs are counted
    for (int i = y1 + 1; i < y2; i++) {
      if (y1 % 4 == 0) {
        totaDays = totaDays + 366;
      } else {
        totaDays = totaDays + 365;
      }
    }
    // if both the years are not equal then loop will run to m1 to `2 and 0 to m2 otherwise m1+1 to
    // less then m2
    if (y1 != y2) {
      for (int i = m1 + 1; i <= 12; i++) {
        totaDays = totaDays + nonLeapYearMap.get(i);
        if (i == 2 && y1 % 4 == 0) {
          totaDays += 1;
        }
      }

      for (int i = 1; i < m1; i++) {
        totaDays += totaDays + nonLeapYearMap.get(i);
        if (i == 2 && y2 % 4 == 0) {
          totaDays += 1;
        }
      }
    } else {
      for (int i = m1 + 1; i < m2; i++) {
        totaDays = totaDays + nonLeapYearMap.get(i);
        if (i == 2 && y1 % 4 == 0) {
          totaDays += 1;
        }
      }
    }

    if (m1 == 2 && y1 % 4 == 0) {
      totaDays += totaDays + 1;
    }
    totaDays += nonLeapYearMap.get(m1) - d1;
    totaDays += d2;

    System.out.println(totaDays);
  }
}
