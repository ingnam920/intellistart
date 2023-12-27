package com.ll;

public class Main {
  public static void main(String[] args) {

    String s = "10 - 20 + 30 - 10 - 10 - 50 + 60";

    String s1 = s.replaceAll("\\- ", "\\+ \\-");
    System.out.println(s1);

    String[] arr = s1.split(" \\+ ");

    int sum = 0;
    for (String sa : arr) {
      sum+=Integer.parseInt(sa);
    }
    System.out.println(sum);

    // 10 * 10   10 * -10   10 * 10 * 10
    String s2 = "10 * -10";






  }
}
