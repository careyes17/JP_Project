//====================================================
//Author: Carlos Reyes
//Latest Update: 09/22/18
//This file contains the fields and methods for
//"Product" instances
//====================================================

package sample;

import java.util.Date;

//Utilizing elements from the Item class
abstract class Product implements Item {

int serialNumber;
String manufacturer;
String manufacturedOn;
String name;
Integer currentProductionNumber;

Product(String name) {
  //Sets this class' name variable to the inputted argument of the Product constructor
  this.name = name;
  //Sets the serial number to be the current next number in the sequence
  serialNumber = currentProductionNumber;
  //Increments the current production number to be ready for the next product's serial number
  currentProductionNumber++;
  //Instanciates a Date object that grabs the date and time of this operation
  Date currentDate = new Date();
  //Takes the date information created by the instantiation and formats it as a string
  manufacturedOn = currentDate.toString();
}

public String toString() {

  //Prints out the information stored for a instance of the Product class
  return "Manufacturer  : " + manufacturer + "\n"
       + "Serial Number : " +  serialNumber + "\n"
       + "Date          : " + manufacturedOn + "\n"
       + "Name          : " + name;
}

}

/*
Manufacturer  : OracleProduction
Serial Number : 1
Date          : Thu May 14 15:18:43 BST 2015
Name          : Product Name
 */

/*
Add a constructor that will take in the name of the product and set this to the field variable name.
You will also assign a serial number from the currentProductionNumber.
The currentProductionNumber should be incremented in readiness for the next instance.
Set manufacturedOn as the current date and time.
 */

/*
 int serialNumber
 String manufacturer
 Date manufacturedOn
 String name
 */