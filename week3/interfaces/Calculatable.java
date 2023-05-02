package week3.interfaces;

import java.util.Collections;
import java.util.List;

public interface Calculatable {
  // before java 8(no default/ static method), 100% abstraction
  int calculate(int a, int b);

  static double average2(){
    return -1.0;
  }

  default double average(List<Integer> integers){
    return sum(integers)/ integers.size();
  }

  default int medium(List<Integer> integers){
    Collections.sort(integers);    // pass by reference
    if (integers.size() % 2 ==1){ // odd number of integers
      return integers.get(integers.size()/2 +1);
    }
    return (integers.get(integers.size()/2 -1)// even number of integers
    + integers.get(integers.size()/2))/2; //

  }

  

//default -> after Java8 
  default int sum(List<Integer> integers){
    int total = 0; 
    for (Integer i : integers){
      total +=i;
    }
    return total;
  }
}
