package week5.lambda;

@FunctionalInterface
public interface Printable <T>{ // class level T; put <T> after printable
  
  void print(T x);
}
