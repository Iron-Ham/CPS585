import java.io.*;
import java.util.Scanner;

public class Classifier {
  public static void main(String[] args) throws FileNotFoundException {
    for (String s : args) {
      File f = new File(s);
      PrintWriter pw = new PrintWriter(new File("_" + s));
      Scanner reader = new Scanner(f);
      reader.nextLine();
      while (reader.hasNext()) {
        String line = reader.nextLine();
        String[] lineData = line.split("[\t\n\r,]+");
        String val = "";
        String val2 = "";
        double z_lat = Double.parseDouble(lineData[16]);
        double z_lon = Double.parseDouble(lineData[17]);
        if (z_lat >= 2) {
            val = ",Far North";
        } else if (z_lat >= 1) {
          val = ",North";
        } else if (z_lat > -1) {
          val = ",Central";
        } else if (z_lat > -2) {
          val = ",South";
        } else {
          val = ",Far South";
        }

        if (z_lon >= 2) {
          val2 = ",Far East";
        } else if (z_lon >= 1) {
          val2 = ",East";
        } else if ( z_lon > -1) {
          val2 = ",Central";
        } else if (z_lat > -2) {
          val2 = ",West";
        } else {
          val2 = ",Far West";
        }

        line = line + val + val2;
        pw.println(line);
      }
      pw.close();
    }

  }
}
