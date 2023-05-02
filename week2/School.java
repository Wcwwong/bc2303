package week2;

import java.util.List;

public class School {
  
  int area;
  List<Student> students;//name

  //Getter
  public List<Student> getStudents(){
    return this.students;
  }
  //setter
  public void setStudents(List<Student>students) {
    this.students = students;
    
  }
}
