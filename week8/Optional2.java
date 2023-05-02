package week8;

import java.util.Optional;

public class Optional2 {
  
  public static void main(String[] args) throws Exception {
    Optional <String> s = Optional.of("Red"); // cannot be null, null pointer exception
    Optional <String> s2 = Optional.ofNullable("Yellow");
    s2 = s2.or(()->Optional.of("default s2"));
    Optional <String> s3 = Optional.empty();

    s3.ifPresent(e -> {
      System.out.println("yes"); // s3 is not null, therefore no print out
    });

    if(s3.isEmpty()) 
    System.out.println("The string in Opeional<String> is null");

    if(s2.isPresent()){
      System.out.println(s2.get()); // need .get() to fetch the value inside the Optional
    }

    String result = s2.orElse("default"); 
    result = s2.orElseThrow(() -> new Exception());
    Optional <String> optionalString = s2.or(() -> Optional.of("default"));
  }
  public Optional <String> removeSpace(String s){
    // remove all space
    if (s == null) 
    return Optional.empty();
    return Optional.of(s.replaceAll(" ", ""));

  }
}
