package ru.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxTest {

    @Test
    void When10To8Then10MoreThan8() {
        int left = 10;
        int right = 8;
        int result = Max.max(left, right);
        int expected = left;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void When60To100Then100MoreThan60() {
        int left = 60;
        int right = 100;
        int result = Max.max(left, right);
        int expected = right;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void When2To2ThenEqual() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = right;
        assertThat(result).isEqualTo(expected);

    }
}