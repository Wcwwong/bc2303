package week1;

import java.util.Arrays;

public class Array1 {
  public static void main(String[]args){
    int[]array = new int[3];
    array[1] = 100;
    System.out.println(Arrays.toString(array));

    int[] array2 = new int [] {10, 20, 4, 200, 2};
    System.out.println(Arrays.toString(array2));

    int total = 0;
    for (int e : array2){
      if (e >50){
      System.out.println(e); //print 200 only
    }
    total = total + e; //come here 4 times
   } 
   //total = array2[0] + array2[1] + array2[2] + array2[3]
   System.out.println(total);
    // Convert array2 to a String Array
    String[] strArray = new String[array2.length];
    //for (String s : strArray){
    //System.out.println();
    //}
    for (int i = 0; i < strArray.length; i++){//counter
      strArray[i] = String.valueOf(array2[i]);
    }
    System.out.println(Arrays.toString(strArray));
  }
}

