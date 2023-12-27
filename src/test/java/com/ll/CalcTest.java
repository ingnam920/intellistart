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
    @DisplayName("50 - 30 == 20")
    void t3(){
        assertThat(Calc.run("50 - 30")).isEqualTo(20);
    }

    @Test
    @DisplayName("10 - 30 - 10 + 50 - 10 == 10")
    void t4(){
        assertThat(Calc.run("10 - 30 - 10 + 50 - 10")).isEqualTo(10);
    }

}
