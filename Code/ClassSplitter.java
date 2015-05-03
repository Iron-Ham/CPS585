import java.io.*;
import java.util.Scanner;

//7 DPNT
//This file will split data based on their DPNT/DPNP class
//8 DPNP

public class ClassSplitter {
  public static void main(String[] args) throws Exception {
    PrintWriter verywarm = new PrintWriter("../data/DPNT Class/verywarm.csv");
    PrintWriter verydry = new PrintWriter("../data/DPNP Class/verydry.csv");
    PrintWriter dry = new PrintWriter("../data/DPNP Class/dry.csv");
    PrintWriter warm = new PrintWriter("../data/DPNT Class/warm.csv");
    PrintWriter averagedpnt = new PrintWriter("../data/DPNT Class/average.csv");
    PrintWriter averagedpnp = new PrintWriter("../data/DPNP Class/average.csv");
    PrintWriter wet = new PrintWriter("../data/DPNP Class/wet.csv");
    PrintWriter verywet = new PrintWriter("../data/DPNP Class/verywet.csv");
    PrintWriter cold = new PrintWriter("../data/DPNT Class/cold.csv");
    PrintWriter verycold = new PrintWriter("../data/DPNT Class/verycold.csv");

    String header = "";
    for (String s : args) {
      File f = new File(s);
      Scanner fileReader = new Scanner(f);
      header = fileReader.nextLine();

      while (fileReader.hasNext()) {
        String line = fileReader.nextLine();
        String[] vals = line.split(",");

        String dpntClass = vals[7].trim();
        String dpnpClass = vals[8].trim();

        if (dpntClass.equalsIgnoreCase("cold"))
          cold.println(line);
        else if (dpntClass.equalsIgnoreCase("very cold"))
          verycold.println(line);
        else if (dpntClass.equalsIgnoreCase("warm"))
          warm.println(line);
        else if (dpntClass.equalsIgnoreCase("very warm"))
          verywarm.println(line);
        else if (dpntClass.equalsIgnoreCase("average"))
          averagedpnt.println(line);


        if (dpnpClass.equalsIgnoreCase("wet"))
          wet.println(line);
        else if (dpnpClass.equalsIgnoreCase("very wet"))
          verywet.println(line);
        else if (dpnpClass.equalsIgnoreCase("dry"))
          dry.println(line);
        else if (dpnpClass.equalsIgnoreCase("very dry"))
          verydry.println(line);
        else if (dpnpClass.equalsIgnoreCase("average"))
          averagedpnp.println(line);
      }
    }

    cold.close();
    verycold.close();
    wet.close();
    verywet.close();
    averagedpnt.close();
    averagedpnp.close();
    warm.close();
    verywarm.close();
    dry.close();
    verydry.close();
  }
}
