package week1;

public class DataType { //class
  
  public static void main(Strings[] args) { //method
    //The variable inside a method is local variable
    //char
    char gender = 120;
    System.out.println(gender);

    //naming conversion
    final int DAYS_OF_A_WEEK = 7;

    int DaysOfYear = 52*DAYS_OF_A_WEEK;

    String amount1= "1000";
    String amount2= String.valueOf(amount1);

    int a = 1; //primitive
    Integer b= 1; //non-primitive data type (Type)

    //overflow
    int i =200;
    byte j = (byte) i; //downgrade, byte -128 to 127
    System.out.println(j); // prints -56
    a = Integer.MIN_VALUE;
    a = a + 1;
    System.out.println("a=" + a); //overflow

    //Operator
    int x =10;
    x = x + 1;
    x++;
    x +=1;// x = x + 1;
    x -= 2; //x = x - 2;
    x *=3; // x = x * 3;
    x /=11; // x = x/11;
    System.out.println(x); // x= 3;
    x--; // x = x -1;
    System.out.println(x); // x= 2;

    //Reminder
    int s = 10;
    int reminder = s % 3;
    System.out.println(reminder);// reminder =1

    int counter =0;
    System.out.println(counter); //0
    System.out.println(++counter);//1, execute ++ first, then println
    System.out.println(counter);//1
    System.out.println(counter++);//1, execute println first, then ++
    System.out.println(counter);//2
  }
}
