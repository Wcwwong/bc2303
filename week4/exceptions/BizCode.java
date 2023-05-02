package week4.exceptions;

public enum BizCode {
  
  SUCCESS("000000", "Success."),
  FAIL("90000", "Fail."),
  FAIL_DIVIDE_ZERO("90001","Divide Zero.")
  ;

  private String code;
  private String desc;

  private BizCode(String code, String desc){
    this.code = code;
    this.desc = desc;
  }

  public String getCode() {
    return this.code;
  }

  public String getDesc() {
    return this.desc;
  }
}
