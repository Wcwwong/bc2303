package week5.lambda;

@FunctionalInterface
public interface ConcatOperation {

  String compute(String a, String b);
  

  static String concatString(String a, String b, ConcatOperation operation){
    return operation.compute(a, b);
  }

  public static void main(String[] args) {
    ConcatOperation concatByEmptyString = (a,b) -> a + "" + b;

    ConcatOperation concatByComma = (a, b) -> {       //a + "," + b;
         String c = a + ";" + b;
         return c;
  };
  ConcatOperation concatBySemiColon = (a, b) -> a + ";" + b;

    System.out.println(concatString("abc", "def", concatByComma)); 

    System.out.println(concatString("Vincent", "Lau", concatBySemiColon)); 

    System.out.println(concatString("Venturenix", "Lab", concatByEmptyString));
  }
}
