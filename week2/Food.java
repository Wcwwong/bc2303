package week2;

public class Food {
  public static void meat(){
    System.out.println("meat is tasty");
  }

  public void fruit(){
    System.out.println("fruit is juicy");
  }
}

  class Hamburger extends Food {

    public static void meat(){
      System.out.println("meat in hamburger is tasty");
    }

    public void fruit(){
      System.out.println("fruit does not go well with hamburger");
    }

    public static void main(String[] args) {
      Food f1 = new Food();
      Food hamburger = new Hamburger();
      System.out.println();
      f1.meat();
      hamburger.fruit(f1());
      System.out.println(hamburger());
    }
  }


