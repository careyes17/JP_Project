//====================================================
//Author: Carlos Reyes
//Latest Update: 11/12/18
//This file contains the fields and methods for
//"Screen" instances
//====================================================

package sample;

public class Screen implements ScreenSpec {

  private String resolution;
  private int refreshrate;
  private int responsetime;

  Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  @Override
  public String getResolution() {
    return resolution;
  }

  @Override
  public int getRefreshRate() {
    return refreshrate;
  }

  @Override
  public int getResponseTime() {
    return responsetime;
  }

  /**
   * Converts values of Screen attributes to a String.
   *
   * @return Returns resolution, refreshrate, and responsetime in a String format.
   */
  public String toString() {

    //Prints out the information stored for a instance of the Product class
    return "Resolution : " + resolution + "\n"
        + "Refresh rate : " + refreshrate + "\n"
        + "Response time : " + responsetime;
  }
}
