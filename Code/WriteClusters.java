import java.io.*;
import java.util.Scanner;

public class WriteClusters {
  public static void main(String[] args) {
    File testing;
    File training;
    Scanner testReader = null;
    Scanner trainReader = null;
    PrintWriter testOut = null;
    PrintWriter trainOut = null;
    try {
      testing = new File("../data/testing.csv");
      training = new File("../data/training.csv");
      testOut = new PrintWriter("../data/testing_clustered.csv");
      trainOut = new PrintWriter("../data/training_clustered.csv");
      trainReader = new Scanner(testing);
      testReader = new Scanner(training);
    } catch (Exception e) {
      System.err.println("Uh oh.");
    }

    if (testReader != null) {
      String headerLine = trainReader.nextLine() +",DPNT Class" + ",DPNP Class";
      testReader.nextLine();
      testOut.println(headerLine);
      trainOut.println(headerLine);
    }

    while (trainReader.hasNext()) {
      //Get Line
      String line = trainReader.nextLine();
      String[] values = line.split(",");

      //Get values
      double dpnt = Double.parseDouble(values[2]);
      double dpnp = Double.parseDouble(values[4]);
      //Process Values
      line += assignDPNT(dpnt);
      line += assignDPNP(dpnp);
      //Print Values
      trainOut.println(line);
    }
    while (testReader.hasNext()) {
      //Get Line
      String line = testReader.nextLine();
      String[] values = line.split(",");

      //Get values
      double dpnt = Double.parseDouble(values[2]);
      double dpnp = Double.parseDouble(values[4]);
      //Process Values
      line += assignDPNT(dpnt);
      line += assignDPNP(dpnp);
      //Print Values
      testOut.println(line);
    }
    testOut.close();
    trainOut.close();
  }

  public static String assignDPNT(double dpnt) {
    double cluster0 = 2.3173;
    double cluster1 = -2.3277;
    double cluster2 = 0.8876;
    double cluster3 = -0.0699;
    double cluster4 = -1.0415;
    double closest = 9999;

    String cluster = "";

    if (getDistance(dpnt, cluster0) < closest) {
      closest = cluster0;
      cluster = ",Very Warm";
    } else if (getDistance(dpnt, cluster1) < closest) {
      closest = cluster1;
      cluster = ",Very Cold";
    } else if (getDistance(dpnt, cluster2) < closest) {
      closest = cluster2;
      cluster = ",Warm";
    } else if (getDistance(dpnt, cluster3) < closest) {
      closest = cluster3;
      cluster = ",Average";
    } else if (getDistance(dpnt, cluster4) < closest) {
      closest = cluster4;
      cluster = ",Cold";
    }
    return cluster;
  }

  public static String assignDPNP(double dpnp) {
    double cluster0 = -16818;
    double cluster1 = -10.168;
    double cluster2 = 19.0992;
    double cluster3 = 4.4046;
    double cluster4 = 0.2841;
    double closest = 9999;

    String cluster = "";

    if (getDistance(dpnp, cluster0) < closest) {
      closest = cluster0;
      cluster = ",Dry";
    } else if (getDistance(dpnp, cluster1) < closest) {
      closest = cluster1;
      cluster = ",Very Dry";
    } else if (getDistance(dpnp, cluster2) < closest) {
      closest = cluster2;
      cluster = ",Very Wet";
    } else if (getDistance(dpnp, cluster3) < closest) {
      closest = cluster3;
      cluster = ",Wet";
    } else if (getDistance(dpnp, cluster4) < closest) {
      closest = cluster4;
      cluster = ",Average";
    }
    return cluster;
  }

  public static double getDistance(double val, double cluster) {
    return (Math.abs(cluster-val));
  }

}
