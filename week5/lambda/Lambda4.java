package week5.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda4 {

  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();

    Function<String, Integer> function = s -> s.length();
    //map.put("Peter", 4);
   // map.put("Mary", "Mary".length());// "Mary".length() is result
    Integer output = map.computeIfAbsent("Peter", function);// function is a formula to 
    System.out.println(output);

    output = map.computeIfAbsent("Peter", function); // only one "Peter", line 20 after -> won't print an extra Peter
    System.out.println(output);

    for(Map.Entry<String, Integer>entry : map.entrySet()){
      System.out.println(entry.getKey()+ " "+ entry.getValue());
    }
    
    Integer a= 1;
    Integer.sum(1, 3);

   BiFunction<Integer, Integer, Integer> mergeFrequencyByName = Integer ::sum; // (x, y) -> x + y;
   System.out.println(mergeFrequencyByName.apply(1,3));
  }
  
}
