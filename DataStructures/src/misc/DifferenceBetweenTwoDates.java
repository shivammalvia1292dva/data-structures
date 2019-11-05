package misc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DifferenceBetweenTwoDates {
  public static void main(String[] args) throws ParseException {
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    String dateOne = "09/12/1992";
    String dateTwo = "01/25/1992";

    Date date1 = format.parse(dateOne);
    Date date2 = format.parse(dateTwo);

    long difference = date2.getTime() - date1.getTime();

    System.out.println(difference/1000/60/60/24);
  }
}
