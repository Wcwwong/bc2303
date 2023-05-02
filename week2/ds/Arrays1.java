package week2.ds;

public class Arrays1 {

  public static void main(String[] args) {
    // declare array reference: String[] str
    // initialize instance of array, and assign to object reference
    String [] str = new String[3]; // just these methods in array
    String []str2 = new String[]{"123", "abc"};
    strs[0] = new String("hello");
    strs[1] = "hello";
    int length = strs.length;
    length = str2.length;

    //for loop
     for (String s: strs){ // (string: index in the string)
      System.out.println(s);
     }
     // approach 2
     String result = "";
     int maxLength;
     if (strs.lengh < strs2.length){
      maxLength = strs2.length;
     } else{
      maxLength = strs.length;
     }
     for (int i = 0; i < maxLength; i++){
      if (i < strs.length-1){
         result += str[i];
      }
      if (i < strs2.length-1){
        result += str2[i];
     }

    }
  }

  
}
