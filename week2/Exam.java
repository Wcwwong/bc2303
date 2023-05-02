package week2;

public class Exam {
  private String type;
  private int score;
  private boolean isPassed;
  

  //Getter
  //Setter

  public void setScore(int score){
    this.score=score;

  if (this.score>50){
    this.isPassed = true;
  }else{
    this.isPassed = false;
  
  }
  

  }
}


