package week3.insurance;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Policy {
  PolicyNo policyNo;
  String planCode; //database = CL345
  LocalDate paidToDate;
  LocalDate effDate;
  LocalDate expiryDate;
  BigDecimal premium;
  Integer paymentMode; // 1, 3, 6, 12
  // LocalDate dateOfBirth; only for customer, policy has no date of birth attribute
  List<Coverage> coverage;

  @Override
  public boolean equals(Object o){
    if (this ==o) //address
    return true;
    if (!(o instanceof Policy))
    return false;
    Policy policy = (Policy) o;
    return this.policyNo.getPolicyNo().equals(policy.getPolicyNo().getPolicyNo());
  }

  public PolicyNo getPolicyNo(){
    return this.policyNo;
  }

  public Policy(PolicyNo polNo){
    this.policyNo=polNo;
  }
  public static Policy of(){
    return new Policy(polNo);
  }

  public static void main(String[] args) {
    Policy pol1 = Policy.of(new PolicyNo());// fancier version of the same line as below
    Policy pol2 = new Policy(new PolicyNo());
  }
  
}
