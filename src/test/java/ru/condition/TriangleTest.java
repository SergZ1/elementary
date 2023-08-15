package ru.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TriangleTest {

    @Test
    void exist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 5.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();


    }
}