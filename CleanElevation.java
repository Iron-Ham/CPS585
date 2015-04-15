import java.io.*;
import java.util.Scanner;

public class CleanElevation {
  public static void main(String[] args) throws FileNotFoundException {
    for (String s : args) {
      File f = new File(s);
      PrintWriter pw = new PrintWriter(new File("_" + s));
      Scanner reader = new Scanner(f);

      while (reader.hasNext()) {
        String line = reader.nextLine();
        String[] lineData = line.split("[\t\n\r,]+");
        if (lineData[2].equals("unknown"))
          continue;
        else {
          pw.println(line);
        }
      }
      pw.close();
    }

  }
}
