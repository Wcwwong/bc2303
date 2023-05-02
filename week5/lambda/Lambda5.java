package week5.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import week1.Strings;

public class Lambda5 {

  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("abc");
    strings.add("def");

    for (String s : strings){

    }
    // for each
    strings.forEach(s -> System.out.println(s)); // consumer
    // we cannot use local variable declared in main method inside forEach
    int a = 0;
    // imagine forEach is a blackbox
    strings.forEach(s -> {
      // usually we call void method here
      // i.e load s into database
    });
    Map<String, Integer> ages = new HashMap<>();
     ages.put("Peter", 18);
     ages.put("Paul", 19);
     ages.put("Mary", 20);

     for (Map.Entry<String, Integer> entry:ages.entrySet()){ // don't use for loop to loop map, use key value to access directly
        System.out.println(entry.getKey());
        System.out.println(entry.getValue());
     }
   //forEach
     ages.forEach((k, v) -> System.out.println(k + "," + v));
  }

  public static String concat(String s1){
    return s1 + "c";
  }
  
}
