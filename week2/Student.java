package week2;

public class Student {
  

  private String course;
  private String firstName;
  private String lastName;
  private int age;

  //Behaviours/method
  //Setter of firstName
  public void setFirstName(String firstName1){
    this.firstName = firstName1;
  }
  public void setLastName(String lastName1){
    this.lastName = lastName1;
  }
  public void setCourses(String course){
    this.course = course;
  }
  public void setage(int age){
    this.age = age;
  }
  //Getter of firstName
  public String getFirstName(){
    return this.firstName;
  }
  public String getLastName(){
    return this.lastName;
  }
}
