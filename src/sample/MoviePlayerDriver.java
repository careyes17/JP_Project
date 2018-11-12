//====================================================
//Author: Carlos Reyes
//Latest Update: 11/12/18
//This file is a driver for the class "MoviePlayer"
//====================================================

package sample;

import static sample.MonitorType.LCD;

public class MoviePlayerDriver {

  /**
   * Driver "main" method for MediaPlayer.
   */
  public static void main(String[] args) {
    MoviePlayer mp = new MoviePlayer("Generic", new Screen("Generic", 0, 0), LCD);
    //System.out.println(mp);
    mp.play();
    mp.next();
    mp.previous();
    mp.stop();
  }
}
