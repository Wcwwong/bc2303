package week3.Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student extends Person implements Calculatable{

  Integer year; //use wrapper class if there will not be many data structure transform
 
  public Student(){ // empty constructor

  }
  public Student (double height, double weight, int year){
    super(height, weight);
    this.year = year;
  }
  @Override
  public void walk(){   // first person around to implement walk, sleep and swim
    System.out.println("walk method");
  }
  @Override
  public int calculate(int x, int y){
    return x + y;
  }

  @Override
  public void sleep(){  //can implement in person to have a default method

  }

  @Override
  public void swim(){

  }

  @Override
  public String toString(){
    return "[" + "year=" + this.year //
               + "," + "height=" + super.getHeight() //
               + "," + "weight" + super.getWeight() 
               + "]";
  }

  public static void main(String[] args) {     //main for execute
    Student student = new Student(170.5, 60.3, 2);
    student.walk();
    student.sleep();
    student.swim();

    List<Integer> integers = new ArrayList<>(Arrays.asList(100, 200, 300));
    student.sum(integers); // 100+200+300=600

    List<Integer> integers2 = Arrays.asList(10, 30, 100);// 10+30+100=140
    //integers2.add(2);

    Person person = new Student();
    Person person2 = new Student(1.0, 2.0, 3);// height/ weight/ year

    Person person3 = person.getPerson(3);// get object according to category
    // Student student2  = new Person(); // only child class can super parent class
   // person.calculate() // this method does not exist, only student can calculate 
   long l =1; // 1 is int, type promotion (one kind of cast)
   byte a = (byte) 128;// overflow // if java checks the vaule casuing data loss, compile error
   // you can actually cast to make it possible for conversion
  }
}
