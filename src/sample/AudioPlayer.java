//====================================================
//Author: Carlos Reyes
//Latest Update: 11/12/18
//This file contains the fields and methods for
//"AudioPlayer" instances
//====================================================

package sample;


public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecification;
  private ItemType mediaType;

  AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = ItemType.AUDIO;
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

  /**
   * Converts values of AudioPlayer attributes to a String.
   * @return Returns audioSpecification and mediaType in a String format
   */
  public String toString() {

    return super.toString()
        +
        "Audio Spec : "
        +
        audioSpecification
        +
        "\n"
        +
        "Type : "
        +
        mediaType;
  }

  //** Bug found here concerning an instruction given by the assignment **
  @Override
  public int compareTo(Product product) {
    int x;
    x = this.name.compareTo(product.getName());
    return x;
  }
}
