import java.io.*;
import java.util.Scanner;

public class Classifier {
  public static void main(String[] args) throws FileNotFoundException {
    for (String s : args) {
      File f = new File(s);
      PrintWriter pw = new PrintWriter(new File("_" + s));
      Scanner reader = new Scanner(f);

      while (reader.hasNext()) {
        String line = reader.nextLine();
        String[] lineData = line.split("[\t\n\r,]+");
        String val = "";
        String val2 = "";
        String val3 = "";
        double zscore = Double.parseDouble(lineData[10]);
        double zscore_e = Double.parseDouble(lineData[11]);
        double zscore_p = Double.parseDouble(lineData[12]);
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
        if (zscore_e >= 2)
          val2 = ", Very High";
        else if (zscore_e >= 1)
          val2 = ", High";
        else if (zscore_e > -1)
          val2 = ", Normal";
        else if (zscore_e >= -2)
          val2 = ", Low";
        else
          val2 = ", Very Low";

        if (zscore_p >= 2)
          val3 = ", Very Wet";
        else if (zscore_p >= 1)
          val3 = ", Wet";
        else if (zscore_p > -1)
          val3 = ", Normal";
        else if (zscore_p >= -2)
          val3 = ", Dry";
        else
          val3 = ", Very Dry";

        line = line + val + val2 + val3;
        pw.println(line);
      }
      pw.close();
    }

  }
}
