//====================================================
//Author: Carlos Reyes
//Latest Update: 09/22/18
//This file contains the fields and methods for
//"Product" instances
//Copyright (C) 2018 Carlos Reyes, All Rights Reserved
//====================================================

package sample;

import java.util.Date;

//Utilizing elements from the Item class
abstract class Product implements Item, Comparable<Product> {

  int serialNumber;
  String manufacturer = Item.manufacturer;
  Date manufacturedOn;
  String name;
  static int currentProductionNumber = 1;

  Product(String name) {
    //Sets this class' name variable to the inputted argument of the Product constructor
    this.name = name;
    //Sets the serial number to be the current next number in the sequence
    serialNumber = currentProductionNumber;
    //Increments the current production number to be ready for the next product's serial number
    //** Bug found here concerning an instruction given by the assignment **
    currentProductionNumber++;
    //Instanciates a Date object that grabs the date and assigns it
    manufacturedOn = new Date();
  }

  //** Bug found here concerning functionality desired by the program **
  public void setProductionNumber(int productionNumber) {
    currentProductionNumber = productionNumber;
  }

  /**
   * Sets the input name as the name of the widget.
   *
   * @param name input name of the widget
   */
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Date getManufactureDate() {
    return manufacturedOn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  /**
   * Prints a product instance's information to the console.
   *
   * @return information regarding manufacturer, serialNumber, manufacturedOn, and name to the
   *     console.
   */
  public String toString() {

    return
        "Manufacturer : " + manufacturer + "\n" + "Serial Number : " + serialNumber + "\n"
            + "Date : " + manufacturedOn + "\n" + "Name : " + name + "\n";
  }

  /*
  Manufacturer  : OracleProduction
  Serial Number : 1
  Date          : Thu May 14 15:18:43 BST 2015
  Name          : Product Name
 */

  /*
  Add a constructor that will take in the name of the product and set this to the field
  variable name. You will also assign a serial number from the currentProductionNumber.
  The currentProductionNumber should be incremented in readiness for the next instance.
  Set manufacturedOn as the current date and time.
 */

  /*
  int serialNumber
  String manufacturer
  Date manufacturedOn
  String name
  */
}
