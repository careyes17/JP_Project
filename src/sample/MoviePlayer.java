//====================================================
//Author: Carlos Reyes
//Latest Update: 11/12/18
//This file contains the fields and methods for
//"MoviePlayer" instances
//====================================================

package sample;

//checkstyle and findbugs error noted - intentional according to project specifications
public class MoviePlayer extends Product implements MultimediaControl {

  private Screen screenType;
  private MonitorType monitorType;

  MoviePlayer(String name, Screen screenType, MonitorType monitorType) {
    super(name);
    this.screenType = screenType;
    this.monitorType = monitorType;
  }

  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  @Override
  public void previous() {
    System.out.println("Selecting Previous");
  }

  @Override
  public void next() {
    System.out.println("Selecting Next");
  }

  @Override
  public String toString() {

    return super.toString()
        + "Screen : " + screenType + "\n"
        + "Monitor Type : " + monitorType;
  }

  //** Bug found here concerning an instruction given by the assignment **
  @Override
  public int compareTo(Product product) {
    int x;
    x = this.name.compareTo(product.getName());
    return x;
  }
}
