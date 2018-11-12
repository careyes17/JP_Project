//====================================================
//Author: Carlos Reyes
//Latest Update: 09/22/18
//This file is contains the enum "ItemType" with
//various classifications
//Copyright (C) 2018 Carlos Reyes, All Rights Reserved
//====================================================

package sample;

public enum ItemType {

  AUDIO("AU"),
  VISUAL("VI"),
  AUDIOMOBILE("AM"),
  VISUALMOBILE("VM");

  String type;

  /**
   * Sets the indicated format type as the type.
   * @param type type of format
   */
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