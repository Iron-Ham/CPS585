import java.util.Scanner;
import java.io.*;

//DPNT = 7
//DPNP = 8
public class DPNTClassAnalysis {
  public static void main(String[] args) throws Exception {
    PrintWriter result = new PrintWriter("../Results/dpnt_distribution.txt");

    for (String s : args) {
      File f = new File(s);
      Scanner fileReader = new Scanner(f);
      fileReader.nextLine();
      int total = 0;
      int wetCount = 0;
      int dryCount = 0;
      int veryWetCount = 0;
      int veryDryCount = 0;
      int averageCount = 0;

      while (fileReader.hasNext()) {
        String line = fileReader.nextLine();
        String[] vals = line.split(",");
        String dpnpClass = vals[8].trim();
        if (dpnpClass.equalsIgnoreCase("very wet"))
          veryWetCount++;
        else if (dpnpClass.equalsIgnoreCase("very dry"))
          veryDryCount++;
        else if (dpnpClass.equalsIgnoreCase("dry"))
          dryCount++;
        else if (dpnpClass.equalsIgnoreCase("wet"))
          wetCount++;
        else if (dpnpClass.equalsIgnoreCase("average"))
          averageCount++;
        total++;
      }

      result.println("====================\n" + s + "\n====================");
      result.println("Total: " + total);
      result.println("Very Dry: " + veryDryCount);
      result.println("Dry: " + dryCount);
      result.println("Average: " + averageCount);
      result.println("Wet: " + wetCount);
      result.println("Very Wet: " + veryWetCount);
      result.println("\n");
    }
    result.close();
  }
}
