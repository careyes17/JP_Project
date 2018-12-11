//====================================================
//Author: Carlos Reyes
//Latest Update: 12/10/18
//This file contains the fields and methods for
//"EmployeeInfo" instances
//====================================================

package sample;

import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

  private StringBuilder name;
  private String code;
  private String deptId;
  //checkstyle error noted - intentional according to project specifications
  private Pattern p;
  private Scanner in;

  /**
   * Sets up the employee information with user input data.
   */
  EmployeeInfo() {
    in = new Scanner(System.in, "UTF-8");
    System.out.println("Please enter your first and last name: ");
    setName();
    System.out.println("Please enter the department ID: ");
    setDeptId();
    in.close();
  }

  public StringBuilder getName() {
    return this.name;
  }

  public String getCode() {
    return this.code;
  }

  public String getDepId() {
    return this.deptId;
  }

  /**
   * Reverses the input "id" string using recursion and returns the reversed string.
   */
  public String reverseString(String id) {
    if (id.length() == 0) {
      return id;
    }
    return reverseString(id.substring(1)) + id.charAt(0);
  }

  @Override
  public String toString() {
    return "Employee Code : " + code + "\r\n" + "Department Number : " + deptId;
  }


  /**
   * Sets the name of an employee and checks to make sure the name that was input has a space.
   */
  private void setName() {
    StringBuilder tempName = new StringBuilder(inputName());
    if (checkName(tempName) == true) {
      this.name = tempName;
      createEmployeeCode(tempName);
    } else {
      //System.out.println("Please enter a valid name.");
      //setName();
      this.code = "guest";
    }
  }

  /**
   * Creates an employee code using the name of the user.
   */
  private void createEmployeeCode(StringBuilder name) {
    StringBuilder tempName = new StringBuilder(name);
    this.code = tempName.delete(1, tempName.indexOf(" ") + 1).toString();
  }

  /**
   * Takes the user input name and returns it as a string.
   */
  private String inputName() {
    String inputString = in.nextLine();
    return inputString;
  }

  /**
   * Checks the input value for name to check if there is a space within the name.
   */
  private boolean checkName(StringBuilder name) {
    if (name.indexOf(" ") != -1) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Sets the department ID of an employee by reversing the input ID upon validation, or assigns a
   * default ID of "None01".
   */
  private void setDeptId() {
    String inputString = in.nextLine();
    if (validId(inputString)) {
      this.deptId = reverseString(inputString);
    } else {
      this.deptId = "None01";
    }
  }

  private String getId() {
    return this.deptId;
  }

  /**
   * Validates the input ID using regex to match the specifications of the instructions.
   */
  private boolean validId(String id) {
    p = Pattern.compile("[A-Z]{1}[a-z]{3}[0-9]{2}");
    Matcher m = p.matcher(id);
    if (m.find()) {
      return true;
    } else {
      return false;
    }
  }

}
