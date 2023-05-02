package week1;

import java.sql.Time;

public class Helloworld {
  public static void main(Strings[] args){


    //primitive data type
    //int stand integer, + or -
    int age = 23;
    age = age + 10;
    int year = 1997;
    //naming convertion, caml-case 
    double ageWithDp = 23.3;
    double willy = 23; // -> 23.0
    boolean isCompleted = true; // true, false
    // non-primitive data type
    String str =" abcd";
    String str2 = "456pqr";
    String str3 = str + str2 + "your name is";
    long amount = 20000;
    amount =20000*5;
    System.out.println("amount=" + amount);
     
    //char
    char space = ' ';
    char gender = 'F'; 
    System.out.println("space"+ space + gender);
    //short cut: sysout
    
    System.out.println("str=" + str);
    System.out.println(age);
    System.out.println(ageWithDp);
    System.out.println(willy);
    System.out.println(year);
    System.out.println(str3);
    
    System.out.println(str);

    System.out.println(isCompleted + " space " + str);

    willy = 25;
    

    System.out.println(willy);
    System.out.println("Hello World!!你好嗎");
  }
}
