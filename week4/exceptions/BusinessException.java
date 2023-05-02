package week4.exceptions;

public class BusinessException extends Exception {


  //BusinessException becomes a checked exception
  public BusinessException(){  //empty constructor

  }
  public BusinessException(String message){ 
    super(message);
  }
  public BusinessException(String message, Throwable cause){
    super(message, cause);
  }
  public BusinessException(Throwable cause){
    super(cause);
  }
}
