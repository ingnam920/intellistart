package com.ll;

public class main2 {
  public static void main(String[] args) {
    String s = "sdaejjxsss";
    int[] arr = {1, 2, 4, 6};
    int max = 0;
    int l = s.length();


    for (int i = 0; i < s.length(); i++) {
      for (int j = i + 1; j < s.length(); j++) {
        if (s.charAt(i) == s.charAt(j)) {
          l--;
        }
      }
    }
    System.out.println(l);


  }
}
