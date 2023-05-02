package week2;

class StringHolder {
  
}
public class Methods {

  public static void main(String[] args) {
    AmountHolder amountHolder = new AmountHolder(10);
    System.out.println(amountHolder.getAmount());
  }
  
  public static AmountHolder getAmountHolder(int x){
    AmountHolder amountHolder = new AmountHolder(x);
    return amountHolder;
  }
}
