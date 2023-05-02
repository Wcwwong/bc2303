package week4.ds;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hashmaps {
  
  public static HashMap<String, String> hashMap = new HashMap<>();// non-synchronized
  public static Hashtable<String, String> hashtable = new Hashtable<>(); // synchronized

  public static void main(String[] args) {
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("name", "John");
    hashMap.put("age","18");
    hashMap.put("name", "Mary"); // replace, due to same key
    hashMap.put("apple-website", "www.apple.com"); // can store constant value
    System.out.println(hashMap);

    System.out.println(hashMap.get("name")); //Mary
    System.out.println(hashMap.containsKey("name")); // true
    System.out.println(hashMap.containsValue("Mary"));// true, if "John" is false

    for(Map.Entry<String, String> entry:hashMap.entrySet()){
      System.out.println(entry);
    } // map is an interface

  }
  
}
