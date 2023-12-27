package com.ll;

public class Calc {
  public static int run(String exp) {
    boolean needToMultiply = exp.contains("*");
    boolean needToPlus = exp.contains("+");
    boolean needToMinus = exp.contains("-");

    exp = Value1(exp);

    int sum = 0;
    int mul = 1;
    if (needToPlus) {

      if (needToMultiply) {
        if (needToMinus) {
          exp = exp.replaceAll("\\- ", "\\+ \\-");
        }

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
      if (needToMinus) {
        exp = exp.replaceAll("\\- ", "\\+ \\-");
      }


      String[] bits = exp.split(" \\+ ");
      sum = 0;

      for (int i = 0; i < bits.length; i++) {
        sum += Integer.parseInt(bits[i]);
      }
      return sum;

    } else if (needToMinus) {
      exp = exp.replaceAll("\\- ", "\\+ \\-");

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
      String[] bits = exp.split(" \\+ ");
      sum = 0;

      for (int i = 0; i < bits.length; i++) {
        sum += Integer.parseInt(bits[i]);
      }
      return sum;

    }
    throw new RuntimeException("처리할수있는계산식이아냐");
  }

  public static String Value1(String exp) {
    while (exp.charAt(0) == '(' && exp.charAt(exp.length() - 1) == ')') {
      exp.substring(1, exp.length() - 1);
    }
    return exp;
  }


}




