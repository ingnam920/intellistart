package com.ll;

public class Calc {
  public static int run(String exp) {
    exp = Value1(exp);
    boolean needToMultiply = exp.contains("*");
    boolean needToPlus = exp.contains("+");
    boolean needToMinus = exp.contains("-");
    boolean needbrac = exp.contains("(");


    int sum = 0;
    int mul = 1;
    if (needbrac) {
      exp = Value2(exp);
    }

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
      } else if (needToMinus) {
        exp = exp.replaceAll("\\- ", "\\+ \\-");
        String[] bits = exp.split(" \\+ ");
        sum = 0;

        for (int i = 0; i < bits.length; i++) {
          sum += Integer.parseInt(bits[i]);
        }
        return sum;
      } else {
        String[] bits = exp.split(" \\+ ");

        for (int i = 0; i < bits.length; i++) {
          sum += Integer.parseInt(bits[i]);
        }
        return sum;
      }


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

    } else if (needToMultiply) {
      String[] s1 = exp.split(" \\* ");
      for (String n : s1) {
        mul *= Integer.parseInt(n);
      }
      return mul;
    }


    throw new RuntimeException("처리할수있는계산식이아냐");

  }


  public static String Value1(String exp) {
    int outbrac = 0;
    while (exp.charAt(outbrac) == '(' && exp.charAt(exp.length() - 1 - outbrac) == ')') {
      outbrac++;
    }
    if (outbrac == 0) return exp;

    return exp.substring(outbrac, exp.length() - outbrac);
  }

  public static String Value2(String exp) {


    while (exp.contains("(")) {

      int num = 0;
      int start = 0;
      int index = -1;
      int last = -1;

      for (int i = 0; i < exp.length(); i++) {
        if (exp.charAt(i) == '(') {
          start = i;

        } else if (exp.charAt(i) == ')') {
          index = i;
          break;
        }
      }
      String str = exp.substring(start, index + 1);

      exp = exp.replace(str, Integer.toString(Calc.run(str)));
    }
    return exp;
  }


}




