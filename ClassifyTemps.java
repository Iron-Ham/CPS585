import java.io.*;
import java.util.Scanner;

public class ClassifyTemps {
  public static void main(String[] args) throws FileNotFoundException {
    for (String s : args) {
      File f = new File(s);
      PrintWriter pw = new PrintWriter(new File("_" + s));
      Scanner reader = new Scanner(f);

      while (reader.hasNext()) {
        String line = reader.nextLine();
        String[] lineData = line.split("[\t\n\r,]+");
        String val = "";
        double zscore = Double.parseDouble(lineData[10]);
        System.out.println(s);
        if (zscore >= 2)
          val = ", Very Warm";
        else if (zscore >= 1)
          val = ", Warm";
        else if (zscore > -1)
          val = ", Normal";
        else if (zscore >= -2)
          val = ", Cold";
        else
          val = ", Very Cold";
        line = line + val;
        pw.println(line);
      }
      pw.close();
    }

  }
}
