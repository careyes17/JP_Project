package sample;

import java.util.Date;

abstract class Product implements Item {

int serialNumber;
String manufacturer;
String manufacturedOn;
String name;
Integer currentProductionNumber;

Product(String name) {
  this.name = name;
  serialNumber = currentProductionNumber;
  currentProductionNumber++;
  Date currentDate = new Date();
  manufacturedOn = currentDate.toString();
}

public String toString() {

  return "Manufacturer  : " + manufacturer + "\n"
       + "Serial Number : " +  serialNumber + "\n"
       + "Date          : " + manufacturedOn + "\n"
       + "Name          : " + name;
}

}

/*
Manufacturer  : OraclProduction
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