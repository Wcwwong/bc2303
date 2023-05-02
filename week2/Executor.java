package week2;

import java.util.List;

public class Executor {
  public static void main(String[] args) {
    Student s = new Student(); // instance or object
    s.setFirstName("John");
    s.setLastName("Smith");

    Student s2 = new Student(); // instance or object
    s2.setFirstName("Mary");
    s2.setLastName("Skinner");

    System.out.println(s.getFirstName());
    System.out.println(s2.getFirstName());

    s.setFirstName("Peter");

    School school=new School();
    List<Student> students = new ArrayList<>();
    students.add(s);
    students.add(s2);
    school.setStudents(students);
  
  

    
  }
  
}
