//====================================================
//Author: Carlos Reyes
//Latest Update: 09/22/18
//This file is contains the enum "ItemType" with
//various classifications
//====================================================

package sample;

public enum ItemType {

  AUDIO("AU"),
  VISUAL("VI"),
  AUDIOMOBILE("AM"),
  VISUALMOBILE("VM");

  String type;

  ItemType(String type) {
    this.type = type;
  }


}

/*
Audio: AU
Visual: VI
AudioMobile: AM
VisualMobile: VM
 */