package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CalcTest {
    @Test
    @DisplayName("1+1==2")
    void t1(){
        assertThat(Calc.run("1 + 1")).isEqualTo(2);
    }
    @Test
    @DisplayName("1+4==5")
    void t2(){
        assertThat(Calc.run("1 + 4")).isEqualTo(5);
    }

    @Test
    @DisplayName("-10 - 10 - 20 = -40")
    void t3(){
        assertThat(Calc.run("-10 - 10 - 20")).isEqualTo(-40);
    }

    @Test
    @DisplayName("10 - 30 - 10 + 50 - 10 == 10")
    void t4(){
        assertThat(Calc.run("10 - 30 - 10 + 50 - 10")).isEqualTo(10);
    }

    @Test
    @DisplayName("10 * 10 = 100")
    void t5(){
        assertThat(Calc.run("10 * 10")).isEqualTo(100);
    }

    @Test
    @DisplayName("10 + 10 * 50 = 510")
    void t6(){
        assertThat(Calc.run("10 + 10 * 50")).isEqualTo(510);
    }

    @Test
    @DisplayName("10 - 10 + 10 + 10 * 10 = 110")
    void t7(){
        assertThat(Calc.run("10 - 10 + 10 + 10 * 10")).isEqualTo(110);
    }

    @Test
    @DisplayName("10 - 10 - 10 - 10 * 10 = -110")
    void t8(){
        assertThat(Calc.run("10 - 10 - 10 - 10 * 10")).isEqualTo(-110);
    }
    @Test
    @DisplayName("-10 * -10 * -10 = -1000")
    void t9(){
        assertThat(Calc.run("-10 * -10 * -10")).isEqualTo(-1000);
    }




}
