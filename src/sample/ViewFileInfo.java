//====================================================
//Author: Carlos Reyes
//Latest Update: 12/10/18
//This file is a driver for the class
//"ProcessFiles" that also tests file reading
//functionality
//====================================================

package sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class ViewFileInfo {

  /**
   * Tests ProcessFiles instance functionality and reads input from file created by the instance.
   */
  public static void main(String[] args) {
    try {
      ProcessFiles pf = new ProcessFiles();
      Stream<String> stream = Files.lines(Paths.get(pf.getP3().toString()));
      stream.forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
