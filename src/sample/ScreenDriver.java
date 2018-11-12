//====================================================
//Author: Carlos Reyes
//Latest Update: 11/12/18
//This file is a driver for the class "Screen"
//====================================================

package sample;

public class ScreenDriver {

  /**
   * Driver "main" method for Screen.
   */
  public static void main(String[] args) {
    Screen s = new Screen("Generic", 0, 0);
    //System.out.println(s);
    System.out.println(s.getRefreshRate());
    System.out.println(s.getResolution());
    System.out.println(s.getResponseTime());
  }
}
