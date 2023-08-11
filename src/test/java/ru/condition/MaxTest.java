package ru.condition;

import  static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxTest {

    @Test
    void When10To8Then10MoreThan8() {
        int left = 10;
        int right = 8;
        String result = Max.max(left, right);
        String expected = "Left > right";
        assertThat(result).isEqualTo(expected);

    }
    @Test
    void When60To100Then100MoreThan60() {
        int left = 60;
        int right = 100;
        String result = Max.max(left, right);
        String expected = "Right > Left";
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void When2To2ThenEqual() {
        int left = 2;
        int right = 2;
        String result = "Left = Right";
        String expected = "Left = Right";
        assertThat(result).isEqualTo(expected);

    }
}