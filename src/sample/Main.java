//====================================================
//Author: Carlos Reyes
//Latest Update: 09/22/18
//This file contains the "main" method of this program
//Copyright (C) 2018 Carlos Reyes, All Rights Reserved
//====================================================

package sample;


import java.util.Date;

public class Main {

  public static void main(String args[]) {

    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());

    for (ItemType it : ItemType.values()) {
      System.out.println(it + " " + it.type);
    }

  }

}

class Widget extends Product {

  public Widget(String name) {
    super(name);
  }

  //** Bug found here concerning functionality desired by the program **
  public void setProductionNumber(int productionNumber) {
    currentProductionNumber = productionNumber;
  }

  /**
   * Sets the input name as the name of the widget
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

}