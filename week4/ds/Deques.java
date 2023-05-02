package week4.ds;

import java.util.Deque;
import java.util.LinkedList;

public class Deques {

  public static void main(String[] args) {
    Deque<String> strings = new LinkedList<>();

    strings.add("Apple");
    strings.add("Watermelon");
    System.out.println(strings);
// offer -> addLast
    strings.offer("Banana");
    System.out.println(strings);
// push -> addFirst
    strings.push("Strawberry");
    System.out.println(strings);
    //String removed = strings.removeLast();// exception when empty queue
    //String removed2 = strings.poll(); // no exception when empty queue
    strings.poll();
    System.out.println(strings);
    strings.element();
    System.out.println(strings);
    strings.pollFirst();
    System.out.println(strings);
    //
  }
  
}
