package week4.sorting.sortpattern;

import java.util.Comparator;

import week4.sorting.Customer;


public class SortByName implements Comparator<Customer> {
  



  @Override
  public int compare(Customer o1, Customer o2) {
  //  return o1.getName().compareTo(o2.getName());
      if(o1.getJoinDate().isAfter(o2.getJoinDate())){
      return -1;
      }
      return 1;    
    }
    return o1.getName().charAt(0) > o2.getName().charAt(0)?-1:0;
  }



}
