package week2;

public class Cat extends Animal{
  // inherited Animal.name
  String color;
  String length;
  public Cat(){
    // super();
  }

  public Cat(String color, String name, String length){
    super(name);
    this.color = color;
  }
  public void setColor(String color){
    this.color = color;
  }


    public int calculateReminder(int a, int b){
      return a % b;
    }
  @Override // documentation
  public String toString(){
    return "[" + this.color + " " + super.name//
            + " " + super.height + "]";
  }

  @Override
  public void sound(){
    System.out.println("Meow Meow Meow");
  }
   public void sound(int x){ // method overloading
    System.out.println(x);
   }
   public void sound(int x) { // method overloading

   }

   public int sumArrays(int[]nums){
    int sum = 0 ;
    for (int num : nums){
      sum += num;
    }
    return sum;
  }
   public int calculate(){ //code accorinding to this method
    return -1;
   }
  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.setName("Kathy");
    cat.setColor("Yellow");

    Cat cat2 = new Cat("Yellow", "Sally");
    System.out.println(cat2.toString());
    cat2.sound();

    System.out.println(cat2.sumArgs(1, 2, 3));

    int[] arr = new int[]{1, 2, 3};// constructor with values
    int[] arr2 = new int[3];// empty constructor
    System.out.println(cat2,sumArrays(arr));// print 6
  }

  public String getName() {
    return this.name;
  }

  public String getColor() {
    return this.color;
  }
}

