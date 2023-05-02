package com.codewave.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class Coin extends Crypto{
  
  private BigDecimal marketcap;
  private String description;

  public Coin(BigDecimal marketCap, String description, String address){
     super(address);
     this.marketcap = marketCap;
     this.description = description;
  }

}
