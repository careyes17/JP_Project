//====================================================
//Author: Carlos Reyes
//Latest Update: 09/22/18
//This file is an interface containing fields and
//methods pertaining to item specifications
//====================================================

package sample;

import java.util.Date;

public interface Item {

  //A constant String variable serving as the manufacturer of all products in this application
  final String manufacturer = "OracleProduction";
  

  public void setProductionNumber(int productionNumber);

  public void setName(String Name);

  public String getName();

  public Date getManufactureDate();

  public int getSerialNumber();
}

/*
 A constant called manufacturer that would be set to “OracleProduction”.
 A method setProductionNumber that would have one integer parameter
 A method setName that would have one String parameter
 A method getName that would return a String
 A method getManufactureDate that would return a Date
 A method getSerialNumber that would return an int
 */