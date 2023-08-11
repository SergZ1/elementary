package ru.condition;

import  static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxTest {

    @Test
    void When3To4Then4() {
        int left = 3;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);

    }
    @Test
    void When4To4Then4t() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void When4To3Then3() {
        int left = 4;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);

    }
}