package week4.exceptions;

public class StockBizException extends BusinessException {
  
  String code;

  private public StockBizException(){

  }

  public StockBizException(BizCode bCode){
   super(bCode.getDesc());
  }

  public static void main(String[] args) {
    int a = 0;

  }

  public static double divide(double x, double y) throws StockBizException {
     Double z = null;
    try{
      z = x / y;
      return z;
     } catch (ArithmeticException e) {
      throw new StockBizException(BizCode.FAIL_DIVIDE_ZERO);
      } finally {
        // No matter try or catch, comes to "finally" block directly.
        z = null;
      }

     }
  }
