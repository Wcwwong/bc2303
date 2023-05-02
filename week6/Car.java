package week6;

public class Car {

  private Driver driver; // state
  private String color; // state

  private double engine;

  public Car() {

  }

  public Car (Driver driver, String color){ // non-static
    this.driver = driver;
    this.color = color;
  }

  public Car(Builder1 builder1){
     this.driver = builder1.getDriver();
     this.color = builder1.getColor();
  }

  public double getEngine() {
    return this.engine;
  }

  public void startEngine(Driver driver){
    this.engine += driver.accelerate(engine);
  }


  public void setDriver(Driver driver){
    this.driver = driver;
  }

  public void setColor(String color) {
    this.color = color;
  }
  public class Builder{
    Driver getDriver = null;
    int age;

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }
  }
public String getColor() {
  return this.color;
}
  @Override
  public String toString(){
    return "[" +
           "driver =" + this.driver +
           "color =" + this.color + 
           "]";
  }

  public static class Builder1 { // static
    private Driver driver;
    private String color;

    public static Builder1 builder(){
      return new Builder1();
    }

    public Builder1 setDriver(Driver  driver){
      this.driver = driver;
      return this;
    }

    public Builder1 setColor(String color){
      this.color = color;
      return this;
    }

    public Driver getDriver() {
      return this.driver;
    }

    public String getColor() {
      return this.color;
    }

    public Car build(){
      return new Car(this);
    }

  }
  public static void main(String[] args) {
    Car car1 = new Car(); //tradional way of initialization
    car1.setColor("Yellow");
    Car car2 = new Car("Red", null);
    
    Car.Builder carBuilder = new Car().new Builder();
    carBuilder.setAge(16);
    System.out.println(carBuilder.getAge());

    Car builtCar = Car.builder()
              .driver("John")
              .color("Yellow")
              .build();
      System.out.println(carBuilder.toString());
  }
  
}
