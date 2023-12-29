package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CalcTest {
  @Test
  @DisplayName("1+1==2")
  void t1() {
    assertThat(Calc.run("1 + 1")).isEqualTo(2);
  }

  @Test
  @DisplayName("1 + 4 = 5")
  void t2() {
    assertThat(Calc.run("1 + 4")).isEqualTo(5);
  }

  @Test
  @DisplayName("-10 - 10 - 20 = -40")
  void t3() {
    assertThat(Calc.run("-10 - 10 - 20")).isEqualTo(-40);
  }

  @Test
  @DisplayName("10 - 30 - 10 + 50 - 10 == 10")
  void t4() {
    assertThat(Calc.run("10 - 30 - 10 + 50 - 10")).isEqualTo(10);
  }

  @Test
  @DisplayName("10 * 10 = 100")
  void t5() {
    assertThat(Calc.run("10 * 10")).isEqualTo(100);
  }

  @Test
  @DisplayName("10 + 10 * 50 = 510")
  void t6() {
    assertThat(Calc.run("10 + 10 * 50")).isEqualTo(510);
  }

  @Test
  @DisplayName("10 - 10 + 10 + 10 * 10 = 110")
  void t7() {
    assertThat(Calc.run("10 - 10 + 10 + 10 * 10")).isEqualTo(110);
  }

  @Test
  @DisplayName("10 - 10 - 10 - 10 * 10 = -110")
  void t8() {
    assertThat(Calc.run("10 - 10 - 10 - 10 * 10")).isEqualTo(-110);
  }

  @Test
  @DisplayName("-10 * -10 * -10 = -1000")
  void t9() {
    assertThat(Calc.run("-10 * -10 * -10")).isEqualTo(-1000);
  }

  @Test
  @DisplayName("(10 + 10) = 20")
  void t10() {
    assertThat(Calc.run("(10 + 10)")).isEqualTo(20);
  }

  @Test
  @DisplayName("10 * 10 * 10 = 1000")
  void t11() {
    assertThat(Calc.run("10 * 10 * 10")).isEqualTo(1000);
  }


  @Test
  @DisplayName("(10 + 10) * 10 = 200")
  void t12() {
    assertThat(Calc.run("(10 + 10) * 10")).isEqualTo(200);
  }

  @Test
  @DisplayName("10 + (10 + 10) = 20")
  void t13() {
    assertThat(Calc.run("10 + (10 + 10)")).isEqualTo(30);
  }

  @Test
  @DisplayName("10 * (10 + 10) = 200")
  void t14() {
    assertThat(Calc.run("10 * (10 + 10)")).isEqualTo(200);
  }

  @Test
  @DisplayName("10 + (10 * 10) = 110")
  void t15() {
    assertThat(Calc.run("10 + (10 * 10)")).isEqualTo(110);
  }

  @Test
  @DisplayName("10 + (10 * 10) + (10 + 10) = 130")
  void t16() {
    assertThat(Calc.run("10 + (10 * 10) + (10 + 10)")).isEqualTo(130);
  }

  @Test
  @DisplayName("10 - (10 * 10) + (15 - 10) = -85")
  void t17() {
    assertThat(Calc.run("10 - (10 * 10) + (15 - 10)")).isEqualTo(-85);
  }

  @Test
  @DisplayName("-(1 + 5 * 2) * 3 + (1 - 2) - 5 = -39")
  void t18() {
    assertThat(Calc.run("-(1 + 5 * 2) * 3 + (1 - 2) - 5")).isEqualTo(-39);
  }

  @Test
  @DisplayName("-(10 + 5) = -15")
  void t19() {
    assertThat(Calc.run("-(10 + 5)")).isEqualTo(-15);
  }

  @Test
  @DisplayName("10 + (10 + 5) * 5= 85")
  void t20() {
    assertThat(Calc.run("10 + (10 + 5) * 5")).isEqualTo(85);
  }

  @Test
  @DisplayName("(10 + (10 + 5)) * 5= 125")
  void t21() {
    assertThat(Calc.run("(10 + (10 + 5)) * 5")).isEqualTo(125);
  }

  @Test
  @DisplayName("((10 * (10 - 2) + (10 + 5))) * 5 = 155")
  void t22() {
    assertThat(Calc.run("((10 * (10 - 2) + (10 + 5))) * 5")).isEqualTo(155);
  }


}
