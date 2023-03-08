package week1;

public class Loops {
  
  public static void main(String[]args){
    //approach 1: for loop 
    int i = 0;

    for (i = 0; i < 5;i++){//count; condition to continue; change of i for every iteration
      System.out.println("hello");
    }
    //ig i=0, then sysout will run 5 times

    //Approach 2: While loop
    i = 0;
    while (i < 5){//condition to continue
    System.out.println("good morning");
    i += 1;
  }

    //Approach 3: do-while loop
    i = 0;
    do {
      System.out.println("hey");
      i++;
    } while (i < 5); // condition to continue

    //for loop with break
    for (int a = 0; a < 4; a++){
      System.out.println("a="+a);
      if (a == 2) {
        break;// this break will exit the for loop
      }
    }


    //Nested For Loop
    for (int x = 0; x < 5; x++){
      for (int y = 0; y < 5; y++){
        System.out.println("x=" + x + ",y=" + y);
      System.out.println("*");
      }
    }
    /**
     **       x=0, row=0, *
     ***      x=1, row=1, **
     ****  
     ***** 
     ******
     */

    for (int x = 0; x < 5; x++){
      //System.out.println("");
      for (int y = x; y >= 0; y--){
        System.out.print("*");
      }
      System.out.println(" ");

      for (int a = 0; a < 5; a++){
        //System.out.println("");
        for (int b = a; b >= 0; b--){
          System.out.print("* ");
        }
        System.out.println(" ");
    }
    }
}
}

