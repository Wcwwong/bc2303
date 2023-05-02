package week5.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Lab {
  // this exmaple is similar to Collections.sort(), Comparator
  public static void swap(List<String> list, Swap<String> c){
    Objects.requireNonNull(list); // defense , not out of bound 
    if(!list.isEmpty()){
      String temp = list.get(0);
    int indexToSwap = c.indexForSwap(list.size());
    if(indexToSwap !=0){    
      list.set(0, list.get(indexToSwap));
      list.set(indexToSwap, temp);
    }
    }
  }

  public static void main(String[] args) {

    List<String> strings = new ArrayList<>(Arrays.asList("JJJ", "AAA", "SSS"));
    //Before Lambda
    SwapHolder ss = new SwapHolder();
    Lab.swap(strings, ss);

    //After Lambda
//    int i = new Random().nextInt(strings.size());
    int i = new Random().nextInt(strings.size());
    Lab.swap(strings, x-> strings.size());// class implement swap, why () -> 1

  }

}
