package week3.Classes;

public class Casts {

  public static void main(String[] args) {
    int i = 'c'; // ascii 99, this is up casting, no need to use (int)
    System.out.println(i);
  }
  
  float f = 10l; // 10l is long number, up cast to float
  long l = (long) f; // downcasting, be careful of data loss, down cast must include ()
}
