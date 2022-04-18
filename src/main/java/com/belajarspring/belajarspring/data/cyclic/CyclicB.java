package com.belajarspring.belajarspring.data.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CyclicB {
  private CyclicC cyclicC;
}
