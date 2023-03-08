package week1;

public class Flow {

  public static void main(String[] args) {
    int a = 0;

    // In this scenario, line 8 -> 10 -> 12 -> 13 ->15
    if (a +1 >= 2){  //>, <, <=, >=
      System.out.println("hello");
    } else if (a +1 ==2){//= means assignment, == means check if they are 
      System.out.println("code");
    } else if (a +1 <2) {
      System.out.println("yeah");
    }
  }
   long b = 100;
   boolean isFemale = true;
  {
   //b ==100, asking you if b equals to 100 -> YES
   // isFemale == false, asking you if isFemale equals to false? -> No
   if (b== 100 && isFemale == false) {
    System.out.println("hello");
   } else {
      System.out.println("code");
    }

    if (b== 100 || isFemale == false) {// || means or
   System.out.println("yes");
  }

  if (b ==99 || isFemale == true && b + 2 > 100) {// || means or
  System.out.println("hi");
}
  }

  boolean o = false; {}
  if (o == false) {
    System.out.println("hello");
  }
   if (o) 
    System.out.println("yes");
    if(!o) {//!o, asking you if o equals to fals
    System.out.println("No");}
    }
    int numericGrade = 20;
    char letterGrade = ' ';
    
    switch (numericGrade) {
        case 90: {
            letterGrade = 'A';
            break;
        }
        case 80: {
            letterGrade = 'B';
            break;
        }
        case 70: {
            letterGrade = 'C';
            // ... lines of code
            break;
        }
        case 60: {
            letterGrade = 'D';
            break;
        }
        case 50: {
            letterGrade = 'E';
            break;
        }
        default: {
            letterGrade = 'F';
            break;
        }
    }
    
    System.out.println("letterGrade: " + letterGrade); // prints 'C'
