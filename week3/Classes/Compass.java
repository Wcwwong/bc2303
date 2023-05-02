package week3.Classes;

public enum Compass { //implicity final
  
  NORTH(1, "North"),// static final ~ final
  SOUTH(-1, "South"),// static final ~ final
  WEST(2, "West"),// static final ~ final
  EAST(-2, "East"),// static final ~ final
  ;
  
  private int number;
  private String desc;

  private Compass(int number, String desc){  //enum finished creating object during compile time
    this.number = number;
    this.desc = desc;
  }

  public int getNumber() {
    return number;
  }

  public String getDesc() {
    return desc;
  }
/**
 * 
 * @param compass Input one of the Compass enum value
 * @return
 */
  public boolean isOpposite(Compass compass){
    return this.number*-1==compass.getNumber();
  }


  private static Compass valuesOf(String s){ //"EAST"
    // input parater s, check if it is an expected value, ig null
  if(s==null)
    return null;
    for (Compass compass: Compass.values()){  // enum.vales()
     if (compass==Compass.valueOf(s.trim())){
      return compass;
     }
    }
    return null;
  }
  public static void main(String[] args) {
    if(Compass.NORTH.isOpposite(Compass.SOUTH)){
      System.out.println("they are opposite");
    }

    System.out.println(Compass.WEST.name());
    if(Compass.WEST== Compass.valuesOf("  W E S T")){ //equal
      System.out.println(Compass.WEST.name());
    }


  }
}
