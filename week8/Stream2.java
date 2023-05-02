package week8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {

  public static void main(String[] args) {
    Employee e1 = new Employee(30, "Alex", BigDecimal.valueOf(30000.00), Arrays.asList("123", "456", "789"));
    Employee e2 = new Employee(35, "Sally", BigDecimal.valueOf(50000.00), Arrays.asList("321", "654", "987"));
    Employee e3 = new Employee(40, "John", BigDecimal.valueOf(10000.00), Arrays.asList("9876", "7654", "4321"));

    List<Employee> employees = new ArrayList<>();
    employees.add(e1);
    employees.add(e2);
    employees.add(e3);

    Predicate<Employee> salaryCondition = e -> e.getSalary().compareTo(BigDecimal.valueOf(20000.00));

    employees.stream()
             .filter(salaryCondition)
             .map(e-> e.getName())
             .collect(Collectors.toList())
             .forEach(s -> {
              System.out.println(s);
             });

    List<String> result = employees.stream()
        .filter(salaryCondition) // Predicate (e->...)
        .map(e -> e.getName())
        .collect(Collectors.toList());

    List<Employee> employees2 = Stream.of("Alison", "Eric", "Michael") //
       .map(s-> new Employee(30, s, BigDecimal.valueOf(15000)))
       .collect(Collectors.toList());

    List<Employee> employees3 = employees2.stream()
        .sorted((s1, s2) -> s1.getName().charAt(0) < s2.getName().charAt(0) ? -1 :1)
        .collect(Collectors.toList());
       
       
        employees2.stream().sorted();

       System.out.println("employees2:");
       for (Employee e: employees2){
        System.out.println(e.getName());
       }

       //consumer
       result.forEach(e-> {
        System.out.println(e);
       });

       List<List<Employee>> employeeLists = new ArrayList<>();
       employeeLists.add(employees3);
       employeeLists.add(employees);

       List<String> allEmployeesName = employeeLists.stream()
           .flatMap(list -> list.stream().map(e -> e.getName())) // flatMap to demolish the data structure
           .collect(Collectors.toList()) // then use map to get the specific data you want
           .sorted();
        for (String s: allEmployeesName){
          System.out.println(s);
        }
        List<String> allContacts = employees.stream()
        .flatMap(e -> e.getContacts().stream())
        .collect(Collectors.toList());
  }
  
}
