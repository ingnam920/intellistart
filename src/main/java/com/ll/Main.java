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

    String s5 = "(10 + 20) * 3";
    int count = 0;
    int index = -1;

    for (int i = 0; i < s5.length(); i++) {
      if (s5.charAt(i) == '(') {
        count++;
      } else if (s5.charAt(i) == ')') {
        count--;
      }
      if (count == 0) {
        index = i;
        break;
      }
    }
    String str1 = s5.substring(0, index + 1);
    String str2 = s5.substring(index + 1);
    System.out.println(str2);
    System.out.println(str1);
    System.out.println(s5);


    int bcount = 0;
    int a = 0;
    while (str1.charAt(bcount) == '(' && str1.charAt(str1.length() - 1 - bcount) == ')') {
      bcount++;
    }
    str1 = str1.substring(bcount, str1.length() - bcount);
    System.out.println(str1);
    String[] s3 = str1.split(" \\+ ");
    for (String s : s3) {
      a += Integer.parseInt(s);
    }
    System.out.println(a);

  }
}
