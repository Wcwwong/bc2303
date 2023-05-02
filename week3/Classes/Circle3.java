package week3.Classes;

import week3.interfaces.Spinable;

public class Circle3 implements Spinable{
  private double radius;
  private double area;

  private Direction direction; // 0= left, 1 = right
  private int speed;

  public Circle3(){


  }

  @Override
  public void changeDirection(Direction direction){
     this.direction = direction;
  }

  @Override
  public boolean stop(){
    if (this.speed==0){
      return false;
    }
    this.speed = 0;
    return true;
  }

public Direction getDirection(){
  return this.direction;
}
  @Override
  public boolean start(){
    if(this.speed !=0){
      return false;
    }
    accelerate(10);
    return true;
  }
  @Override
  public void accelerate(int delta){
    this.speed += delta;
  }
  public static void main(String[] args) {
    Circle3 circle = new Circle3();


  }
}
