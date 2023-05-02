package week1;

import java.util.ArrayList;
import java.util.Arrays;

public class List1 {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(100);
    arrayList.add(4);
    arrayList.remove(1);// index, remove 4
    System.out.println(arrayList);
    System.out.println(arrayList.size()); //size = 1
    System.out.println(arrayList.get(0));//print 100
    
    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(5);
    integers.add(3);
    arrayList.addAll(integers);
    System.out.println(arrayList);

    for (Integer i : arrayList) {
      System.out.println(i);
    }
    ArrayList<Long> arrList = new ArrayList<>();
    arrayList.set(1L); // L is long, if downgrade (eg.int) arrayList.set((int)1)
  
    //String Array List
    //Declare Arraylist of String, "Tesla", "Apple", "AWS"
    Array<String>strArr=new ArrayList<>();
    strArry.add("Tesla");
    strArr.add("Apple");
    strArr.add("Aws");

    //find the index of Apple, contains, indexOf
    int indexOfApple = strArr.indexOf("Apple");
    System.out.println("indexOfAPple="+indexOfApple);
    
    System.out.println(strArr.get(1));//print Apple
    strArr.set(1, "Watermelon");
    System.out.println(strArr.get(1));//print Watermelon

    strArr.set(3, "Watermelon");


    if(!strArr.contains("Tesla")){ //! means does not 
      System.out.println("The list has no Tesla");
    }
    strArr.add("Yellow");
    strArr.add("Blue");
    System.out.println(strArr);

    Collections.sort(strArr);
    System.out.println(strArr);

    ArrayList<Long> longList= new ArrayList<>();
    longList.add(10L); //10 is integer, must add L to define it as long
    longList.add(-4L);
    System.out.println(longList);

    ArrayList<Long> longList2 = new ArrayList<>(Arrays.asList(10L,-4L));
    longList2.add(3L);
    System.out.println(longList2);

    List<String>weekdays = Arrays.asList("Monday", "Tuesday", "Wednesday","Thursday", "Friday");
    //weekdays.add("Sunday"); //this line will cause error

    for(String s:weekdays){
      System.out.println(s);
    }

  }
  
}
