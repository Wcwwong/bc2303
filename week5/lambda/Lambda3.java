package week5.lambda;

public class Lambda3 {
  
  public static void main(String[] args) {
    Printable<String> stringPrinter = x -> System.out.println(x);
    stringPrinter.print("something");
    // stringPrinter.print(100); // not ok

    Printable<Integer> integerPrinter = x -> System.out.println(x);
    integerPrinter.print(100);

    SuperPrintable superPrinter = (x, y) ->{ // lambda expression is the child class
      if ((x.length()+y.length())% 2 ==1){
        return true;
      }
      return false;
    };
    System.out.println(superPrinter.print("abc", "de"));

    SmallPrintable smallPrinter = () -> System.out.println("hello");
    smallPrinter.print();
  }
}
