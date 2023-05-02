package week3.Classes;

import week3.interfaces.Swimable;
import week3.interfaces.WalkContract;

public abstract class Person implements WalkContract, Swimable{

  private double height; //variable
  private double weight;

  public Person(double height, double weight){ // constructor

  }

  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }


  public abstract void walk();

  public abstract void swim();

  public abstract void sleep();


  //factory pattern
  public Person getPerson(int cat){ //1,2,3
    if (cat==1){
       return new Student();
    }else if (cat ==2){
      return new Teacher();
    }
    return new Student(); // if no new sth, java will think there should be another possbile outcome
  }

}

