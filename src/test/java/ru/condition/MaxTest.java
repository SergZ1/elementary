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
        int third = 200;
        int result = Max.max(left, right, third);
        int expected = third;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void When2To2ThenEqual() {
        int left = 2;
        int right = 2;
        int third = 4;
        int fourth = 5;
        int result = Max.max(left, right,third,fourth);
        int expected = fourth;
        assertThat(result).isEqualTo(expected);
    }
}