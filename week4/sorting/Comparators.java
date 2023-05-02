package week4.sorting;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import week4.sorting.sortpattern.SortByName;

public class Comparators {

  public static void main(String[] args) {
    Customer customer1 = new Customer(1, "Alex", LocalDate.of(2022, 1, 1));
    Customer customer2 = new Customer(2, "Benny", LocalDate.of(2017, 1, 15));
    Customer customer3 = new Customer(3, "Carl", LocalDate.of(2021, 12, 31));
    Customer customer4 = new Customer(4, "Mary", LocalDate.of(2015, 2, 25));
    Customer customer5 = new Customer(5, "John", LocalDate.of(2006, 4, 10));

    List<Customer> customers = new LinkedList<>();
     customers.add(customer1);
     customers.add(customer2);
     customers.add(customer3);
     customers.add(customer4);
     customers.add(customer5);
     System.out.println(customers);


    // System.out.println(customers);

     //Collections.sort(customers);

     SortByName nameSorting = new SortByName();
     Collections.sort(customers, nameSorting);
     System.out.println(customers);
  }
  
}
