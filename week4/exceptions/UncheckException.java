package week4.exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class UncheckException {

  public double divide(double a, double b) throws ArithmeticException{
    //unchecked
    if (b==0){
      return -1.0;
    }
    return a/b; // unchecked
  }

  public static void caller2(){
    try{
      divide (10, 0);
    } catch (ArithmeticException e){
      return -1;
    }

  }

  public static void scanFile(String filePath) throws FileNotFoundException { 
    Scanner scanner = new Scanner(new File(filePath));
  // checked exception handling:
  // approach 1: try {} catch(){}
  // approach 2: method signature throws that exception
  }

  public static void caller(){
    // i'm a caller, but there are still 2 apprachese to choose. 
    try{
      scanFile("C:\\abc.txt");
    } catch(FileNotFoundException e){

    }
   
  }

  public static void main(String[] args) {
    int noOfPeople = 0;
    int totalAmount = 1000;


    try{
    double average = totalAmount / noOfPeople;
    }catch (ArithmeticException e){

    }
     try {
      Integer integer = null;
      int x = integer.intValue(); // hit error and go to catch block, skip sysout
      System.out.println(x);
     } catch (NullPointerException e){

     }

  }
 

}
