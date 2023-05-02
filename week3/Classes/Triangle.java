package week3.Classes;

public class Triangle extends Shape3{
  
  double base;
  double height;

  public Triangle(double base, double height){
    this.base = base;
    this.height = height;
  }

  @Override
  public double calcArea(){
    return base*height/2;
  }

  public String sound(){
    return "I am Triangle";
  }

  public double getBase() {
    return this.base;
  }

  public static void main(String[] args) {
    Shape3 shape3 = new Triangle(3, 7);
    // shape3.getClass();//unable to read getbase() from parent object
    Triangle triangle = null;
    if (shape3 instanceof Triangle){
     // triangle= (Triangle) shape3; // maybe runtime error
    }
    System.out.println(triangle.getBase()); // 3.0
  }

  @Override
  public boolean equals(Object obj){
    if (obj == this)
    return true;

    if(!(obj instanceof Triangle))
      return false;
      // downcasting, no runtime error here, 
  }
}
