package week4.sorting;

import java.time.LocalDate;

public class Customer implements Comparable<Customer> {
  private int id;
  private String name;
  private LocalDate joinDate;

  public Customer(int id, String name, LocalDate joinDate){
    this.id=id;
    this.name=name;
    this.joinDate=joinDate;
  }

  public String getName() {
    return this.name;
  }

  public LocalDate getJoinDate() {
    return joinDate;
  }

  @Override
  public int compareTo(Customer o){
    //return this.id > o.id ? -1:1; // if this.id > o.id, this object less than specified object
    if (this.id==o.id){
      if(this.name.charAt(0)> o.name.charAt(0)){
        return -1;
      }
      return 1;
    }
    return this.id > o.id ? -1:1;
  }


  @Override
  public String toString(){
    return new StringBuilder()//
    .append("[")//
    .append(id)//
    .append(",")//
    .append(name)//
    .append(",")//
    .append(joinDate)//
    .append("]")
    .toString();
  
  }



}
