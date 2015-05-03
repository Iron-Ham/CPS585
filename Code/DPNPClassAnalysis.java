import java.util.Scanner;
import java.io.*;
public class DPNPClassAnalysis {
  public static void main(String[] args ) throws Exception {
    PrintWriter result = new PrintWriter("../Results/dpnp_distribution.txt");

    for (String s : args) {
      File f = new File(s);
      Scanner fileReader = new Scanner(f);
      fileReader.nextLine();
      int total = 0;
      int warmCount = 0;
      int coldCount = 0;
      int verywarmCount = 0;
      int verycoldCount = 0;
      int averageCount = 0;

      while (fileReader.hasNext()) {
        String line = fileReader.nextLine();
        String[] vals = line.split(",");
        String dpntClass = vals[7].trim();
        if (dpntClass.equalsIgnoreCase("very warm"))
          verywarmCount++;
        else if (dpntClass.equalsIgnoreCase("very cold"))
          verycoldCount++;
        else if (dpntClass.equalsIgnoreCase("cold"))
          coldCount++;
        else if (dpntClass.equalsIgnoreCase("warm"))
          warmCount++;
        else if (dpntClass.equalsIgnoreCase("average"))
          averageCount++;
        total++;
      }

      result.println("====================\n" + s + "\n====================");
      result.println("Total: " + total);
      result.println("Very cold: " + verycoldCount + "\t" + (double) verycoldCount / total + "%");
      result.println("cold: " + coldCount + "\t" + (double) coldCount / total + "%");
      result.println("Average: " + averageCount + "\t" + (double) averageCount / total + "%");
      result.println("warm: " + warmCount + "\t" + (double) warmCount / total + "%");
      result.println("Very warm: " + verywarmCount + "\t" + (double) verywarmCount / total + "%");
      result.println("\n");
    }
    result.close();
  }
}
