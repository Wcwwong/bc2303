package week2;

public class Circle {

  private double radius;
  private static final double pi = 3.14;

  @Override
  public double area() { // this is a case to calculate a specific circle
    return this.radius * this.radius * 3.14;
  }

  public static double area(double radius) { // this allows a publicily shared method to calculate circles
    return radius * radius * 3.14;
  }
}
