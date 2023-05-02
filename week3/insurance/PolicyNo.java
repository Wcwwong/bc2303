package week3.insurance;

import java.time.LocalDate;

public class PolicyNo {
  
  private String policyNo;
  public static final String noPrefix = "POL";

  private static String yyymmdd="";

  private static int polNoCounter = -1;

  public PolicyNo(){
     this.policyNo= noPrefix + genPolicyNo();
  }

 
  public String getPolicyNo() {
    return policyNo;
  }

 
  public String genPolicyNoString(){
    return String.valueOf(genPolicyNo());
  }
  
  public long genPolicyNo(){
    //YYYYMMDD00000000
    //2023032300000001
    LocalDate currentDate = LocalDate.now();

    String yearMonthDay = ""+ currentDate.getYear()//
    + String.format("%02d", currentDate.getMonthValue()) 
    + String.format("%02d", currentDate.getDayOfMonth());

    long addTailZero = Long.valueOf(yearMonthDay)*100000;

    System.out.println(addTailZero);
    if(!yearMonthDay.equals(yyyymmdd) && !"".equals(yyyymmdd)){
      //reset counter
      polNoCounter = 0;
      yyymmdd = yearMonthDay;
    }
    
    long result = addTailZero + polNoCounter;
    polNoCounter++;
    // 2023032300000001
    return result;

  }

  public static void main(String[] args) {
    PolicyNo pol = new PolicyNo();
    System.out.println(pol.getPolicyNo());
  }
}
