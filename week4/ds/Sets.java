package week4.ds;

import java.util.HashSet;
import java.util.Set;

public class Sets {

  public static void main(String[] args) {
    Set<String> strings = new HashSet<>();
      
      strings.add("Tesla");
      strings.add("iPhone");
      strings.add("iPhone");
      if (!strings.contains("iPhone")){
        System.out.println("yes");
      }

      strings.remove("Tesla"); // removed Tesla
      if (strings.remove("Tesla")){ //cannot printout "removed Tesla"
        System.out.println("removed Tesla");
      }

      System.out.println(strings);
    
  }
  
}
