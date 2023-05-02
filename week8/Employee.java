package week8;

import java.math.BigDecimal;
import java.util.List;

public class Employee {
  private int age;
  private String name;
  private BigDecimal salary;
  private List<String> contacts;
  public Employee(){

  };

  public Employee(int age, String name, BigDecimal salary){
    this.age = age;
    this.name = name;
    this.salary = salary;
    
  }
  public Employee(int age, String name, BigDecimal salary, List<String> contacts){
    this.age = age;
    this.name = name;
    this.salary = salary;
    this.contacts = contacts;    
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public BigDecimal getSalary() {
    return this.salary;
  }

  public List<String> getContacts() {
    return this.contacts;
  }
}
