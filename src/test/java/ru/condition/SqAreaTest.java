package ru.condition;

import  static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SqAreaTest {

    @Test
    void whenP6K2Square2 () {

        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));

    }
@Test
    void whenP10K4Square4 () {

        int expected = 4;
        int p = 10;
        double k = 4;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));

    }

    @Test
    void whenP2K1Square0DOT25 () {

        double expected = 0.25;
        int p = 2;
        double k = 1;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));

    }


}