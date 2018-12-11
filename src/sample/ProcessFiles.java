//====================================================
//Author: Carlos Reyes
//Latest Update: 12/10/18
//This file contains functionality behind writing
//production information to a file
//====================================================

package sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class ProcessFiles {

  //checkstyle error noted - intentional according to project specifications
  private Path p;
  private Path p2;
  private Path p3;

  public Path getP() {
    return p;
  }

  public void setP(Path p) {
    this.p = p;
  }

  public Path getP2() {
    return p2;
  }

  public void setP2(Path p2) {
    this.p2 = p2;
  }

  public Path getP3() {
    return p3;
  }

  public void setP3(Path p3) {
    this.p3 = p3;
  }

  /*
  public static void main(String[] args) throws IOException {
    ProcessFiles pf = new ProcessFiles();
  }
  */

  /**
   * Creates a directory for a file that logs production information if one doesn't exist and tests
   * out this functionality with default values.
   */
  public ProcessFiles() throws IOException {
    //findbugs errors noted - intentional according to project specifications
    p = Paths.get("C:/LineTests");
    p2 = Paths.get("/TestResults.txt");
    p3 = Paths.get(p.toString(), p2.toString());
    //System.out.println(p.toString() + '\n' + p2.toString() + '\n' + p3.toString());
    CreateDirectory();
    EmployeeInfo ei = new EmployeeInfo();
    ArrayList<Product> rlp = new ArrayList<Product>();
    WriteFile(ei);
    WriteFile(rlp);
    //System.out.println(ei);
    //System.out.println(rlp);
  }

  /**
   * Creates the specified directory if it is not already made.
   */
  //checkstyle error noted - intentional according to project specifications
  private void CreateDirectory() throws IOException {
    if (!Files.exists(p)) {
      Files.createDirectories(p);
    }
    if (!Files.exists(p3)) {
      Files.createFile(p3);
    }
  }

  /**
   * Writes EmployeeInfo instance data to the specified file.
   */
  //checkstyle and findbugs error noted - intentional according to project specifications
  public void WriteFile(EmployeeInfo emp) throws IOException {
    Files.write(Paths.get(p3.toString()), emp.toString().getBytes("UTF-8"),
        StandardOpenOption.APPEND);
    Files.write(Paths.get(p3.toString()), System.getProperty("line.separator").getBytes("UTF-8"),
        StandardOpenOption.APPEND);
  }

  /**
   * Writes product data to the specified file.
   */
  //checkstyle and findbugs error noted - intentional according to project specifications
  public void WriteFile(ArrayList<Product> products) throws IOException {
    Files
        .write(Paths.get(p3.toString()), products.toString().getBytes("UTF-8"),
            StandardOpenOption.APPEND);
    Files.write(Paths.get(p3.toString()), System.getProperty("line.separator").getBytes("UTF-8"),
        StandardOpenOption.APPEND);
  }

}
