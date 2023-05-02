package week3.Classes;

import java.math.BigDecimal;

public class BankSubAccount {
  Currency currency;
  BigDecimal amount; // can use double

  public BankSubAccount(Currency currency, BigDecimal amount){
     this.currency=currency;
     this.amount=amount;
  }

  public boolean deposit(BigDecimal amount){    
    if(amount == null|| amount.doubleValue() <= 0){
      return false;
    }
    this.amount.add(amount);
    return true;
  }

  public boolean withdraw(BigDecimal amount){
    if(amount == null|| this.amount.doubleValue()==0//
    || amount.doubleValue() <= 0){
      return false;
    }
    //validation
    if(this.amount.compareTo(amount) >=0){
      this.amount.subtract(amount);
      return true;
    }
      return false;
    }
  }

  public BankSubAccount openAccount(Currency currency, BigDecimal initialAmount){
    BankSubAccount bankSubAccount = null;
    if(initialAmount !=  null && currency != null){
     bankSubAccount = new BankSubAccount(currency, initialAmount);
     }
     return bankSubAccount;
  }
  public static void main(String[] args) {
    BankSubAccount bankSubAccount = BankSubAccount.openAccount(Currency.USD, BigDecimal.valueOf(10000))
  }
}
