import java.io.*;
import java.util.Scanner;

//7 DPNT
//This file will split data based on their DPNT/DPNP class
//8 DPNP

public class ClassSplitter {
  public static void main(String[] args) throws Exception {
    PrintWriter verywarm =


    for (String s : args) {
      File f = new File(s);
      Scanner fileReader = new Scanner(f);
      fileReader.nextLine();

      while (fileReader.hasNext()) {


      }
    }
  }
}
