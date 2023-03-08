package week1;

public class Strings {

  public static void main(String[]args) {
    String name = "Today is a nice day";
    int age = 10;
    int index =4;


    System.out.println("hello");
    System.out.println(name.charAt(0)); //index 0 represents the 1st position
    System.out.println(name.charAt(index));// print 4

    System.out.println(name.indexOf(" ")); //print 3
    
    System.out.println(name.trim());// print 3
    System.out.println(name.replace("Today","The day after tomorrow"));

    System.out.println(name.length()); //print 25
    System.out.println(name.substring(0,6));// start from index 0, end at index 6

    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());

    String newString= name.concat(", but raining.");

    String finalString = newString.toUpperCase();
    System.out.println(finalString);
    System.out.println(name.concat(", but raining.").toUpperCase());

    int a =10;
    if (a==10) {
      System.out.println("");


    }
    String firstName ="John";
    if ("John". equals(firstName)){ // the best way to compare String
      System.out.println("hello");
    } else {
      System.out.println("yeah");
    }

    String s1 = "Hello";
String s2 = "Hello";
System.out.println(s1 == s2); // prints true
System.out.println(s1.equals(s2));  // prints true

String s3 = new String("Hello");
String s4 = new String("Hello");
System.out.println(s3 == s4); // prints false
System.out.println(s3.equals(s4));  // prints true

String str = "brown";
String myString = "The " + "quick " + "brown" + "fox..."; 
System.out.println("The quick brown fox..." == myString); // prints true
System.out.println("The quick brown fox...".equals(myString)); // prints true
  }
  
  Integer i1 =new Integer(10);
  Integer i2 =new Integer(10);{

  if (i1 == i2){
    System.out.println("They are same object in Heap");

  } else {
    System.out.println("They are not the same object in Heap");
  }
 // System.out.println(i1.compareTo(i2));
    if(i1.compareTo(i2)==0){
    System.out.println("They have equal value");
   } else {
    System.out.println("They are not having equal value");
   }

   // Wrapper Class limitation -128 to 127
   Integer d1 = 127;
   Integer d2 = 127;
   Integer e1 = 128;
   Integer e2 = 128;
   if (d1 ==d2){
    System.out.println("d1 = d2");
   } else{
    System.out.println("d1 != d2");
   }
   if (e1 == e2){
    System.out.println("e1=e2");
   } else{
    System.out.println("e1! = e2");
   }
   //Unboxing
   int i = new Integer(1);//unboxing

   //Autoboxing
   Integer integer =128; //new Integer(128)
   Integer integer2 =127;//find if there is existing object with value 127,if yes, then point to same object
int y = Integer.valueOf(1); // new Integer(1)
boolean bool = Boolean.valueOf(true);// new Boolean(true)

Double double2 = new Double(10.98); // by default, 10.98 is a type of double
Float float2 = new Float((float)10.98);

  Character char3 = new Character('a');
   Character c2 = 'a'; //autoboxing
  }
