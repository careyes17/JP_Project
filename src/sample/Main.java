//====================================================
//Author: Carlos Reyes
//Latest Update: 11/12/18
//This file contains main method of this program with
//testing elements
//====================================================

package sample;

import static sample.MonitorType.LCD;

import com.sun.deploy.util.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  /**
   * Main driver method that involves all elements of this project.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in, "UTF-8");
    System.out.println("Welcome to the Oracle Production Company.");
    System.out.println(
        "You can create a(n):" + '\n' + "- Audio Player (AP)" + '\n' + "- Movie Player (MP)" + '\n'
            + "Please enter the type of product that you would like to make: ");
    String typeOfProduct = null;
    typeOfProduct = getTypeOfProductInput(in);
    System.out.println("Specify the number of products that you would like to make.");
    System.out.println("Select any number under or equal to 4000: ");
    int numberToProduce = 0;
    numberToProduce = getNumberToProduce(in);
    ArrayList<Product> productList = new ArrayList<Product>();
    //System.out.println(productList.size());
    productList.addAll(appendCollection(typeOfProduct, numberToProduce));
    //System.out.println(productList.size());
    System.out.println("\nAll products created.");

    boolean notExited = true;
    while (notExited) {
      System.out.println(
          "You can create a(n):" + '\n'
              + "- Create Products (CP)" + '\n'
              + "- Display Products (DP)" + '\n'
              + "- Display Production Statistics (DPS)" + '\n'
              + "- Exit Program (EP)" + '\n'
              + "Please enter your selection: ");
      String userInput = in.nextLine();
      if (userInput.equals("CP")) {
        System.out.println(
            "You can create a(n):" + '\n' + "- Audio Player (AP)" + '\n' + "- Movie Player (MP)"
                + '\n'
                + "Please enter the type of product that you would like to make: ");
        typeOfProduct = getTypeOfProductInput(in);
        System.out.println("Specify the number of products that you would like to make.");
        System.out.println("Select any number under or equal to 4000: ");
        numberToProduce = getNumberToProduce(in);
        productList.addAll(appendCollection(typeOfProduct, numberToProduce));
        System.out.println("\nAll products created.");
      } else if (userInput.equals("DP")) {
        displayColleciton(productList);
      } else if (userInput.equals("DPS")) {
        productsStatistics(productList);
      } else if (userInput.equals("EP")) {
        System.out.println("Exiting...");
        notExited = false;
      } else {
        System.out.println("Your selection was invalid");
      }
    }

    /*
    // Write one line of code to create an ArrayList of products
    List<Product> al = new ArrayList<Product>();
    // Write one line of code to call testCollection and assign the result to the ArrayList
    al = testCollection();
    // Write one line of code to sort the ArrayList
    Collections.sort(al);
    // Call the print method on the ArrayList
    print(al);
    */
  }

  /**
   * Displays all of the products created with their properties.
   */
  public static void displayColleciton(ArrayList<Product> alp) {
    for (int i = 0; i < alp.size(); i++) {
      System.out.println(alp.get(i));
      System.out.println("\n");
    }
  }

  /**
   * Gets statistics from the ArrayList containing all of the products the user has produced.
   */
  public static void productsStatistics(ArrayList<Product> alp) {
    int numberOfAudioPlayers = 0;
    int numberOfMoviePlayers = 0;
    for (int i = 0; i < alp.size(); i++) {
      if (alp.get(i).getClass() == AudioPlayer.class) {
        numberOfAudioPlayers++;
      } else {
        numberOfMoviePlayers++;
      }
    }
    int numberOfUniqueItems = 1;
    if (numberOfAudioPlayers > 0 && numberOfMoviePlayers > 0) {
      numberOfUniqueItems = 2;
    }
    System.out.println("Number of Products Created: " + alp.size());
    System.out.println("Number of Audio Players: " + numberOfAudioPlayers + '\n'
        + "Number of Movie Players: " + numberOfMoviePlayers);
    System.out.println("Number of Unique Products: " + numberOfUniqueItems);
  }

  /**
   * Produces all of the products specified by the user.
   *
   * @return Returns an ArrayList with all of the elements produced.
   */
  public static ArrayList<Product> appendCollection(String typeOfProduct, int numberToProduce) {
    ArrayList<Product> productListTemp = new ArrayList<Product>();
    for (int i = 0; i < numberToProduce; i++) {
      if (typeOfProduct.equals("AP")) {
        productListTemp.add(new AudioPlayer("Generic", "Generic"));
      } else {
        productListTemp.add(new MoviePlayer("General", new Screen("1366x768", 40, 22), LCD));
      }
    }
    return productListTemp;
  }

  /**
   * Gets the type of product that the user wants to produce.
   */
  public static String getTypeOfProductInput(Scanner in) {
    String type = null;
    boolean doneScanning = false;
    while (doneScanning == false) {
      String productInput = in.nextLine();
      if (productInput.equals("AP") || productInput.equals("MP")) {
        doneScanning = true;
        type = productInput;
        System.out.println("You've selected " + productInput);
      } else {
        System.out.println("Please submit a proper product.");
        System.out.println(
            "You can create a(n):" + '\n' + "- Audio Player (AP)" + '\n' + "- Movie Player (MP)"
                + '\n' + "Please enter the type of product that you would like to make: ");
      }
    }
    return type;
  }

  /**
   * Gets the number of items that the user wants to produce of a certain product.
   */
  public static int getNumberToProduce(Scanner in) {
    int numberToProduce = 0;
    boolean doneScanningNumber = false;
    while (doneScanningNumber == false) {
      String productInput = in.nextLine();
      try {
        int parsedInputString = Integer.parseInt(productInput);
        if (parsedInputString <= 4000) {
          doneScanningNumber = true;
          System.out.println("You've selected " + parsedInputString);
          numberToProduce = parsedInputString;
        } else {
          System.out.println("Please submit a proper production number.");
          System.out.println("Select any number under or equal to 4000: ");
        }
      } catch (Exception e) {
        System.out.println("Please submit a proper production number.");
        System.out.println("Select any number under or equal to 4000: ");
      }
    }
    return numberToProduce;
  }

  // Step 15
  // Complete the header for the testCollection method here

  /**
   * This method compiles a list of objects from different classes of this program.
   *
   * @return Returns the ArrayList "products" that contains the test objects for this program.
   */
  public static ArrayList<Product> testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), LCD);
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