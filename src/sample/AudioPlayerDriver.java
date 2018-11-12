//====================================================
//Author: Carlos Reyes
//Latest Update: 11/12/18
//This file is a driver for the class "AudioPlayer"
//====================================================

package sample;

import static sample.ItemType.AUDIO;

public class AudioPlayerDriver {

  /**
   * Driver "main" method for AudioPlayer.
   */
  public static void main(String[] args) {
    AudioPlayer ap = new AudioPlayer("Generic", "Generic");
    //System.out.println(ap);
    ap.play();
    ap.next();
    ap.previous();
    ap.stop();
  }
}
