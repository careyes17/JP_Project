//====================================================
//Author: Carlos Reyes
//Latest Update: 11/12/18
//This file contains main method of this program with
//testing elements
//====================================================

package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  /**
   * Main driver method that involves all elements of this project.
   */
  public static void main(String[] args) {

    // Write one line of code to create an ArrayList of products
    List<Product> al = new ArrayList<Product>();
    // Write one line of code to call testCollection and assign the result to the ArrayList
    al = testCollection();
    // Write one line of code to sort the ArrayList
    Collections.sort(al);
    // Call the print method on the ArrayList
    print(al);
  }

  // Step 15
  // Complete the header for the testCollection method here

  /**
   * This method compiles a list of objects from different classes of this program.
   *
   * @return Returns the ArrayList "products" that contains the test objects for this program
   */
  public static ArrayList<Product> testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    ArrayList<Product> products = new ArrayList<Product>();

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  // Step 16
  // Create print method here
  private static <T> void print(List<T> sortedList) {

    for (T p : sortedList) {
      System.out.println(p);
    }
  }

}