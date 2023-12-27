package com.ll;

public class Calc {
  public static int run(String exp) {
    boolean needToMultiply = exp.contains("*");
    boolean needToPlus = exp.contains("+");


    int sum = 0;
    int mul = 1;
    if (needToPlus) {
      if (needToMultiply) {
        String[] s1 = exp.split(" \\+ ");
        for (String n : s1) {
          String[] s2 = n.split(" \\* ");
          if (s2.length == 1) {
            sum += Integer.parseInt(n);
            continue;
          }
          for (String n2 : s2) {
            mul *= Integer.parseInt(n2);
          }
          sum += mul;

        }
        return sum;
      }
      exp = exp.replaceAll("\\- ", "\\+ \\-");
      String[] bits = exp.split(" \\+ ");
      sum = 0;

      for (int i = 0; i < bits.length; i++) {
        sum += Integer.parseInt(bits[i]);
      }
      return sum;

    } else if (needToMultiply) {
      String[] bits = exp.split(" \\* ");
      int rs = 1;

      for (int i = 0; i < bits.length; i++) {
        rs *= Integer.parseInt(bits[i]);
      }
      return rs;
    }

//    throw new RuntimeException("처리할 수 있는 계산식이 아닙니다");
    throw new RuntimeException("처리할 수 있는 계산식이 아닙니다");
  }
}