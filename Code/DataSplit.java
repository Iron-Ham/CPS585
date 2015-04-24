import java.util.Scanner;
import java.io.*;

public class DataSplit {
  public static void main(String[] args) throws IOException {
    File originalData = new File("Annual_Weather_Cleaned.csv");
    Scanner fileReader = new Scanner(originalData);
    fileReader.useDelimiter("[\t\n\r,]+");
    PrintWriter january = new PrintWriter(new File("January.csv"));
    PrintWriter february = new PrintWriter(new File("February.csv"));
    PrintWriter march = new PrintWriter(new File("March.csv"));
    PrintWriter april = new PrintWriter(new File("April.csv"));
    PrintWriter may = new PrintWriter(new File("May.csv"));
    PrintWriter june = new PrintWriter(new File("June.csv"));
    PrintWriter july = new PrintWriter(new File("July.csv"));
    PrintWriter august = new PrintWriter(new File("August.csv"));
    PrintWriter september = new PrintWriter(new File("September.csv"));
    PrintWriter october = new PrintWriter(new File("October.csv"));
    PrintWriter november = new PrintWriter(new File("November.csv"));

    fileReader.nextLine();
    while (fileReader.hasNext()) {
      String dataLine = fileReader.nextLine();
      String[] data = dataLine.split("[,\t\r\n]+");
      int month = Integer.parseInt(data[5]);
      switch(month) {
      case 1:
        january.println(dataLine);
        break;
      case 2:
        february.println(dataLine);
        break;
      case 3:
        march.println(dataLine);
        break;
      case 4:
        april.println(dataLine);
        break;
      case 5:
        may.println(dataLine);
        break;
      case 6:
        june.println(dataLine);
        break;
      case 7:
        july.println(dataLine);
        break;
      case 8:
        august.println(dataLine);
        break;
      case 9:
        september.println(dataLine);
        break;
      case 10:
        october.println(dataLine);
        break;
      case 11:
        november.println(dataLine);
        break;
      }
    }

    january.close();
    february.close();
    march.close();
    april.close();
    may.close();
    june.close();
    july.close();
    august.close();
    september.close();
    october.close();
    november.close();

  }
}
