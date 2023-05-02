package week3.Classes;

public enum Direction {
  
  LEFT(0, "Left Direction"), //normally every line + , 
  RIGHT(1, "Right Direction"),
  ; // LEFT((byte)0)//downcast

  private int code;
  private String desc;

  private Direction(int code, String desc){
    this.code = code;
    this.desc = desc;
  }

  public int getCode(){
      return this.code;
   
  }

  public String getDesc(){
    return this.desc;
  }
}
