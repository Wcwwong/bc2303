package week2;

public class PassByValueReference {
  
  public static void doSmething(int x){
    x=99;
  }

  public static void doSomething(Integer x){
    x=99;
  }
  public static void doSomething(StringBuilder s){
    s.append(" OK!");
  }
  public static void main(String[] args) {
    // pass by value (scenario 1 -primitive)
    int x = 10;
    doSomething(x);
    System.out.println(x);

    // pass by value (scenario 2 - warpper)
    Integer i =10;
    doSmething(i);
    System.out.println(x);   //print 10


    //pass by reference (object address)
    StringBuilder stringBuilder=new StringBuilder();
    stringBuilder.append("Java");
    doSomething(stringBuilder);
    System.out.println(stringBuilder.toString());// Java OK!
  }
}

