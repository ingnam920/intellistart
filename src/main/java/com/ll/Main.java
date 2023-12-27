package com.ll;

public class Main {
  public static void main(String[] args) {

   /* String s = "10 - 20 + 30 - 10 - 10 - 50 + 60";

    String s1 = s.replaceAll("\\- ", "\\+ \\-");
    System.out.println(s1);

    String[] arr = s1.split(" \\+ ");

    int sum = 0;
    for (String sa : arr) {
      sum += Integer.parseInt(sa);
    }
    System.out.println(sum); */

    // 10 + 5 * 2
    String s2 = "10 + 5 * 2 + 8 * 5 * 2 + 7 * 8 + 10";
    // 10 + (5 * 2)
    // "10 + 8 * 2 + 8 * 4 + 8 -> // 10  8 * 2  8 * 4 8
    String[] arr2 = s2.split(" \\+ ");
    int result;
    int mul = 1;
    int sum = 0;

    for (String n : arr2) {
      mul = 1;
      String[] arr3 = n.split(" \\* ");

      if (arr3.length == 1) {
        sum += Integer.parseInt(n);
        continue;
      }
      for (String n1 : arr3) {
        mul *= Integer.parseInt(n1);
      }
      sum += mul;
    }
    System.out.println(sum);

    String s5="-10 - 10 - 10";
    String s6 = s5.replaceAll("\\- ", "\\+ \\-");
    System.out.println(s6);
  }
}
