package week4.generics;

import java.time.LocalDate;

import week4.sorting.Customer;

//Compile time
public class Holder<K, V extends Customer> {
  
  K key;

  V value;

  public K getKey(){
    return this.key;
  }
  public void setKey(K key) {
    this.key = key;
  }

  public V getValue() {
    return value;
  }

  public void setValue(V value) {
    this.value = value;
  }

  public void put(K key, V value){
    setKey(key);
    setValue(value);
  }

// Runtime
  public static void main(String[] args) {
    Holder<String, Integer> map1 = new Holder<>();
    map1.setKey("John");
    map1.setValue(10);
    // System.out.println(string.getKey());

    Holder<Integer, Customer> map2 = new Holder<>();
    map2.setKey(1);
    map2.setValue(new Customer(1, "Alex", LocalDate.of(2023, 1, 12)));
    //System.out.println(integer.getKey());
    map2.put(2, new Customer(2, "Mary", LocalDate.of(2023, 2, 21)));
  }
}
