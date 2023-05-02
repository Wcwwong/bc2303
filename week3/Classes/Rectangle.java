package week3.Classes;

public class Rectangle extends Shape3 {
  double length;
  double width;

  public Rectangle(double length, double width){
    this.length = length;
    this.width = width;
  }

  public double calcArea(){
    return length*width;
  }

  public double perimeter(){
    return(length + width)*2;
}
