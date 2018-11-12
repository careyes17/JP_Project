//====================================================
//Author: Carlos Reyes
//Latest Update: 11/12/18
//This file is a driver for the class
//"MultimediaControl"
//====================================================

package sample;

import static sample.MonitorType.LCD;

public class MultimediaDriver implements MultimediaControl {

  /**
   * Driver "main" method for MultimediaControl.
   */
  public static void main(String[] args) {
    AudioPlayer ap = new AudioPlayer("Generic", "Generic");
    MoviePlayer mp = new MoviePlayer("Generic", new Screen("Generic", 0, 0), LCD);
    ap.play();
    mp.play();
    MultimediaDriver mmd = new MultimediaDriver();
    mmd.play();
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
}
