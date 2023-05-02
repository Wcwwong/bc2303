package week5.lambda;


import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExercise {
  
  public static void main(String[] args) {
    // define a formula
    // function interface


//    Function <String, Integer> function = x -> x.length(); 
       Function <String, Boolean> formula = s ->{
        if(s.length()==5){
          return true;
        }
        return false;
       };

       formula.apply("hello");
//       if(isValid("hello", formula)){

       }

 //      }
    //make use of the formula
  

//  public static boolean isValid(String string, Function<String, Boolean> formula) {
//    return function.apply(x);

BiFunction <String, Integer, Integer> asciiOfCharAtIndex = (s, i)->{
  //"John" -> "J"
  //"Mary" -> "M"
  return (int) s.charAt(i);
 // if (s1.valueOf(bifunction) == s2.valueOf(bifunction)){
 //   return Integer s3;
  };
  System.out.println(asciiOfCharAtIndex.apply("Mary", 2)); 
}
  }
}
