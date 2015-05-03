import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class CreateTrainingData {
  public static void main(String[] args) throws FileNotFoundException {
    PrintWriter training = new PrintWriter(new File("../data/training.csv"));
    Random rn = new Random();

    training.println("Station, Station Name, Elevation, Latitude, Longitude, Date, DPNP, DPNT, DPT90, DX32,Normalized DPNT,Normalized Elevation,Normalized DPNP, DPNT Class, Elevation Class, DPNP Class, Normalized Latitude, Normalized Longitude, Latitude Class, Longitude Class");
    for (String s : args) {
      File f = new File(s);
      Scanner fileReader = new Scanner(f);
      fileReader.nextLine();

      while (fileReader.hasNext()) {
        int rNum = rn.nextInt(1000) + 1;
        if (rNum <= 632) {
          training.println(fileReader.nextLine());
        }
      }
    }
    training.close();
  }
}
