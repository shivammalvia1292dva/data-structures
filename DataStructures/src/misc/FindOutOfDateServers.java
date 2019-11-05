package misc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// make a map of key = "Database,MySQL" with list of server name and version in a model as it's
// value...so all you have to do is to iterate over list and find the minimum version
public class FindOutOfDateServers {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(new FileInputStream("FindOutOfDateServersList.txt"));
    List<String> list = new ArrayList<>();
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      list.add(line);
    }
    // HashMap<String,Version>
    for (String str : list) {
      String[] array = str.split(",");
    }
  }
}
